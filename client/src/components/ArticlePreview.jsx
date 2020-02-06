import React from 'react';
import { Card, Button } from 'react-bootstrap';
import trimString from '../utils/trimString';
import { Link } from 'react-router-dom';

const ArticlePreview = ({ id, title, date, author, content }) =>
  <Card className='mt-4'>
    <Card.Header as="h2">{title}</Card.Header>
    <Card.Body>
      <Card.Subtitle>Posté par {author.name} le {date.toLocaleString()}</Card.Subtitle>
      <Card.Text>
        {trimString(content)}...
      </Card.Text>
      <Link to={`/articles/${id}`}>
        <Button variant="primary">Lire la suite</Button>
      </Link>
    </Card.Body>
  </Card>
;

export default ArticlePreview;
