import './App.css';
import React, { useState, useEffect } from 'react';

const ContactManager = () => {
  const [contacts, setContacts] = useState(() => {
    const storedContacts = localStorage.getItem('contacts');
    return storedContacts ? JSON.parse(storedContacts) : [];
  });
  const [newContact, setNewContact] = useState({ name: '', email: '', message: '' });
  const [editIndex, setEditIndex] = useState(null);
  const [submitting, setSubmitting] = useState(false);
  const [error, setError] = useState(null);

  useEffect(() => {
    localStorage.setItem('contacts', JSON.stringify(contacts));
  }, [contacts]);

  const handleInputChange = event => {
    const { name, value } = event.target;
    setNewContact(prevState => ({
      ...prevState,
      [name]: value
    }));
  };

  const handleSubmit = async event => {
    event.preventDefault();
    if (editIndex !== null) {
      const updatedContacts = [...contacts];
      updatedContacts[editIndex] = newContact;
      setContacts(updatedContacts);
      setEditIndex(null);
    } else {
      setContacts(prevContacts => [...prevContacts, newContact]);
    }
    setNewContact({ name: '', email: '', message: '' });

    setSubmitting(true);
    setError(null); // Reset error state

    try {
      // Send form data to server endpoint
      const response = await fetch('YOUR_SERVER_ENDPOINT', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(newContact),
      });

      if (!response.ok) {
        throw new Error('Failed to send email');
      }

      console.log('Email sent successfully!');
    } catch (error) {
      console.error('Failed to send email:', error.message); // Log error message
      setError(error.message); // Set error state
    }

    setSubmitting(false);
  };

  const handleEdit = index => {
    setNewContact(contacts[index]);
    setEditIndex(index);
  };

  const handleDelete = index => {
    const updatedContacts = [...contacts];
    updatedContacts.splice(index, 1);
    setContacts(updatedContacts);
  };

  return (
    <div>
      <h1>Contact List</h1>
      <form onSubmit={handleSubmit} id="Contactform">
        <label>Name:</label>
        <input type="text" name="name" value={newContact.name} onChange={handleInputChange} />

        <label>Email:</label>
        <input type="email" name="email" value={newContact.email} onChange={handleInputChange} />

        <label>Message:</label>
        <textarea name="message" value={newContact.message} onChange={handleInputChange} />

        <button type="submit" disabled={submitting}>{editIndex !== null ? 'Edit Contact' : 'Add Contact'}</button>
      </form>
      {error && <div className="error">{error}</div>}
      <table>
        <thead>
          <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Message</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          {contacts.map((contact, index) => (
            <tr key={index}>
              <td>{contact.name}</td>
              <td>{contact.email}</td>
              <td>{contact.message}</td>
              <td>
                <button onClick={() => handleEdit(index)}>Edit</button>
                <button onClick={() => handleDelete(index)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default ContactManager;
