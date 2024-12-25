import { useState } from 'react'
import './App.css'
import ChatInput from './components/ChatInput'
import ChatResponse from './components/ChatResponse'
function App() {
    const [response, setResponse] = useState(null);
    const [loading, setLoading] = useState(false);
    const handleQuestionSubmit = async (question)=> {
      setLoading(true);
      setResponse(null); 
      try {
        
      } catch (error) {
        alert("An error occurred while fetching the response")   
      }
      finally{
        setLoading(false);  

    }
  }
    return (
     
     <div className="App">
      <header className="bg-primary text-white text-center py-5">
        <h1>Chatbot</h1>
    </header>
      <ChatInput onSubmit={handleQuestionSubmit}/>
        <ChatResponse/>
      </div> 

  )
}

export default App;
