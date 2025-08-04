import logo from './logo.svg';
import './App.css';
import React from 'react';
import {aboutus} from './aboutus';
import {Contact} from './Contact';
import {Home} from './Home';



function App() {
  return (<div>
    <Home/>
    =================
    <aboutus/>
    ===========

    <Contact/>
    ==================
    </div>
  );
}

export default App;
