
import './App.css'
import ExpenseComponent from './components/ExpenseComponent'
interface Grettingprop{
  name: string;
  city:string;

}
function Gretting({name,city}:Grettingprop){
  return(
    <>
      <h2>hello{name} from{city}</h2>
    </>
  )
}

interface Abuttonprops{
  title:string;
  disabled:boolean;

}

function handler(){
  alert('Button cliscked')
}

function Abutton({title,disabled}:Abuttonprops){
  return(
    <>
      <button disabled={disabled} onClick ={handler} >{title}</button>
    </>
  )
}
function App() {
 

  return (
    <>
       <div>
        <Gretting name="IBMER" city ="BNgalore"/>
        <ExpenseComponent/>
        <Abutton title='Abutton' disabled = {false}  />
       </div>
        
    </>
  )
}

export default App
