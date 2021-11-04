import "./style.css"

const Footer = ({empresa}) => {
    const generateDateString = () => {
        const creationYear = "2021";
        const currentYear = `${new Date().getFullYear()}`;
        return creationYear === currentYear ? currentYear : `${creationYear} - ${currentYear}`;
    }

    return(
        <footer id="footer">
            <h4>Todos os direitos reservados a {empresa}. &copy;Copyright {generateDateString()}</h4>
        </footer>
    )
}

export default Footer;