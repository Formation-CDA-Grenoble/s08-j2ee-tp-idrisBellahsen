import React from 'react';
import { articles } from '../data';
import { ArticlePreview, Layout } from '../components';

const ArticleList = () =>
  <Layout>
    {articles.map( (article, index) =>
      <ArticlePreview key={`article${index}`} id={index} {...article} />
    )}
  </Layout>
;

export default ArticleList;
