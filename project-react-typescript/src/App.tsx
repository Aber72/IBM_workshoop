
import './App.css'
import ExpenseComponent from './components/ExpenseComponent'
function Gretting({name,city}:Grettingprop){
  return(
    <>
      <h2>hello{name} from{city}</h2>
    </>
  )
}
function App() {
 

  return (
    <>
       <div>
        <Gretting name="IBMER" city ="BNgalore"/>
        <ExpenseComponent/>
       </div>
        
    </>
  )
}

export default App
