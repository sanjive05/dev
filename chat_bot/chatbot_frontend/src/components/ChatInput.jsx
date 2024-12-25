
import {useState} from "react"
const  ChatInput = ({onSubmit}) => {
    const [question, setQuestion] = useState("");
    const handleOnsubmit = (e) => {
        e.preventDefault();
        if(question.tirm()){
            onsubmit(question);
            setQuestion("");
        }
    }
    return (
      <div className="container my-5">
        <div onSubmit={handleOnsubmit} >
            <div className="form-group">   
                <label htmlFor="question">As    k a Question</label>
                <input type="text" className="form-control" id="question" placeholder="Enter your question" value={question} 
                onChange={(e)=> setQuestion(e.target.value)} 
                />
                </div>
        </div>
        <button type="submit" className="btn btn-primary">Submit</button>
      </div>
    )
  }
  export default ChatInput;