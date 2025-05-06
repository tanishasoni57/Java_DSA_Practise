
import React , {  useState } from "react";
import { Link } from "react-router-dom"; // <-- Add this line
const UserLogin = () => {
    const [email , setEmail] = useState(''); //it is left empty because if i write anything inside it it will become permanent email value and wont change eve mai kitni kosish karlun nayi email daalne ki iske liye maine neeche input mai value pass ki hai email
    // Remove the unused userData state 
    
    const [password , setPassword] = useState('') //this is called two way binding to let react know what we are typing in the form
    const submitHandler = (e)=>{
        e.preventDefault(); //this is used to prevent the default behaviour of the form which is to refresh the page when we click on submit button
        // Removed setUserData as userData state is no longer used
        setEmail('') //this is used to set the email to empty string after the form is submitted
        setPassword('') //this is used to set the password to empty string after the form is submitted
    }
    return(

    <div className="p-7 h-screen flex flex-col justify-between">
        <div>
        <img className="w-25 mb-10" src="https://www.pngmart.com/files/22/Car-Logo-PNG-HD-Isolated.png" alt=""/>

        <form onSubmit={(e)=>{
            submitHandler(e)
        }}>
            <h3 className="text-lg font-medium mb-2">
                What's your email ?
            </h3>
            <input 
                required 
                value={email}
                onChange={ (e) => setEmail(e.target.value) }
                className="bg-[#eeeeee] mb-7 rounded px-4 py-2 border w-full text-l placeholder:text-base"
                type="email" 
                placeholder='email@example.com'
            />

            <h3 className="text-lg font-medium mb-2">
                Enter Password
            </h3>

            <input
            className="bg-[#eeeeee] mb-7 rounded px-4 py-2 border w-full text-l placeholder:text-base"
            required
            type="password"
            placeholder="password"
            value={password}
            onChange={ (e) => setPassword(e.target.value) }
            />
            <button className="bg-[#111] text-white font-semibold mb-3 rounded px-4 py-2  w-full text-l placeholder:text-base">
                Login
            </button>
            <p className="text-center">
                New here ?  
                <Link to='/signup' className='text-blue-600'>
                  Create new Account
                </Link>
            </p>
        </form> 
        </div>
        <div>
            <Link to='/captain-login'  className="bg-[#10b461]  flex items-center justify-center text-white font-semibold mb-5 rounded px-4 py-2  w-full text-l placeholder:text-base">
                Sign in as Captain
            </Link>
        </div>
    </div>
    )
}
export default UserLogin;