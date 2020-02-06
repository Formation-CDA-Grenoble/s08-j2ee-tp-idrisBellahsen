import React from 'react';
import { Layout } from '../components';
import { Image } from 'react-bootstrap';

const NotFound = () =>
  <Layout>
    <h1>Erreur 404: Page non trouvée</h1>
    <Image src="https://media.giphy.com/media/YyKPbc5OOTSQE/giphy.gif" rounded />
  </Layout>
;

export default NotFound;
