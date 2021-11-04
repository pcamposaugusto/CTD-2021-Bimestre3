import "./style.css";

const Sobre = ({empresa}) => {
    
    return(
        <section id="sobre">
            <h3>Sobre a <em>{empresa}</em></h3>
            <p>
                A <strong><em>{empresa}</em></strong> é uma plataforma de divulgação de produções cinematográficas nacionais. Ao oferecer uma curadoria única, primamos pela informação de qualidade e dividimos o amor pelo cinema brasileiro. Junte-se a nós e aproveite!
            </p>
        </section>
    )
}

export default Sobre;
