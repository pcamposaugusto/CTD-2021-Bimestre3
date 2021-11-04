import Video from "../Video";
import "./style.css"

const Galeria = () => {

    return(
        <section id="galeria">
            <div className="grid">
                <Video url="https://www.youtube.com/embed/wweuSi_krNs" title="O som ao redor" />
                
                <Video url="https://www.youtube.com/embed/Jc5qJZ7hpto" title="Animal cordial" />

                <Video url="https://www.youtube.com/embed/Rty-sn4SdG8" title="Jogo de cena" />
            </div>
        </section>
        
    )
}

export default Galeria;