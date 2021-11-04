import Header from "./components/Header";
import Banner from "./components/Banner";
import Sobre from "./components/Sobre";
import Galeria from "./components/Galeria";
import Footer from "./components/Footer";
import cartaz from "./assets/cartaz.jpg"
import './App.css';

function App() {
  const texto = "Num futuro próximo, Bacurau, uma pequena cidade brasileira no oeste de Pernambuco, lamenta a perda de sua matriarca. Dias depois, seus habitantes aos poucos percebem algo estranho acontecer na região: enquanto drones passeiam pelos céus, estrangeiros chegam pela primeira vez na cidade com planos de exterminar toda a população ali residente. Ao chegarem à conclusão de que estão sendo atacados, resta identificar o inimigo e criar coletivamente um meio de defesa.";

  const btn = "Assista o trailer";

  const trailer = "https://youtu.be/1DPdE1MBcQc";

  const nomeEmpresa = "Brasil Filmes";
  
  return (
    <>
      <Header empresa={nomeEmpresa} />
      <main>
        <Banner>
          <img src={cartaz} alt="cartaz do filme Bacurau com um pôr-do-sol em uma paisagem">
          </img>
          <p>{texto}</p>
          <a href={trailer} target="_blank" rel="noreferrer">{btn}</a>
        </Banner>
        <Sobre empresa={nomeEmpresa} />
        <Galeria />
      </main>
      <Footer empresa={nomeEmpresa} />
    </>
  );
}

export default App;
