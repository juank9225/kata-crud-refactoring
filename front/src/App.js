import React from 'react';
import Form from './componentes/Form';
import List from './componentes/List';
import { StoreProvider } from './componentes/Store';

function App() {
  return <StoreProvider>
    <div className='contenido'>
    <h3>To-Do List</h3>
    <Form />
    <List />
    </div>
  </StoreProvider>
}

export default App;