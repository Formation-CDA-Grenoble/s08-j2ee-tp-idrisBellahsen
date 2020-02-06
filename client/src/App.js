import React from 'react';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import { NotFoundPage, ArticleListPage, ArticlePage } from './pages';

function App() {
  return (
    <BrowserRouter>
      <Switch>
        <Route exact path='/' component={ArticleListPage} />
        <Route exact path='/articles/:id' component={ArticlePage} />
        <Route component={NotFoundPage} />
      </Switch>
    </BrowserRouter>
  );
}

export default App;
