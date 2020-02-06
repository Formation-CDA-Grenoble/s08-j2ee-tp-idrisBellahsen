import React from 'react';
import { Navbar, Nav } from 'react-bootstrap';
import { Link } from 'react-router-dom';

const Header = () =>
  <Navbar bg="primary" variant="dark">
    <Navbar.Brand>CDA Blog</Navbar.Brand>
    <Nav className="mr-auto">
      <Link to='/' style={{ color: 'lightgrey' }}>Accueil</Link>
    </Nav>
  </Navbar>
;

export default Header;
