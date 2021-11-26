import { useNavigate } from "react-router-dom";
import { useEffect } from "react";

const NotFound = () => {
    const navigate = useNavigate();

    useEffect(() => {
        const timerId = setTimeout(() => {
            navigate("/")
        }, 5000);

        return () => clearTimeout(timerId);
    }, [])
    
    return (
        <>
            <h1>“404 Ops! A página não foi encontrada."</h1>
        </>
    )
}

export default NotFound;
