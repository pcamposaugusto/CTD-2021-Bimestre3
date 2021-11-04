import "./style.css";

const Header = ({empresa}) => {
    return(
        <header>
            <h1>{empresa}</h1>
            <nav>
                <ul>
                    <li><a href="#sobre">Sobre</a></li>
                    <li><a href="#galeria">Galeria</a></li>
                    <li><a href="#footer">Footer</a></li>
                </ul>
            </nav>
        </header>
    );
}

export default Header;