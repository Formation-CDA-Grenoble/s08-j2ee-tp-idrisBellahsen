import React from 'react';
import { Container } from 'react-bootstrap';
import { Header } from '.';

const Layout = ({ children }) =>
  <div>
    <Header />
    <main>
      <Container>
        {children}
      </Container>
    </main>
  </div>
;

export default Layout;
