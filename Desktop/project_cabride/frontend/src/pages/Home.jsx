import React from "react";
import { Link } from "react-router-dom";
const Home =() => {
    return(
        <div>
            <div className="bg-no-repeat bg-center bg-cover bg-[url(https://static.vecteezy.com/system/resources/previews/000/655/164/large_2x/back-to-school-kids-cartoons-vector.jpg)] h-screen pt-8  w-full flex justify-between flex-col bg-lime-200">
                <img className="w-25 ml-8" src="https://www.pngmart.com/files/22/Car-Logo-PNG-HD-Isolated.png" alt=""/>
                <div className="bg-white pb-7 py-4 px-4">
                    <h2 className='text-3xl font-bold text-center'>Lets Cab Ride ;)</h2>
                    <Link to='/login' className="flex items-center justify-center w-full bg-black text-white py-3 rounded mt-5">Continue</Link>
                </div>
            </div>
        </div>
    )
}
export default Home;    