import { Component } from 'react';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import apiViaCep from '../../service/apiViaCep';
import { Link } from 'react-router-dom';


export default class App extends Component {
  constructor() {
    super();
    this.state = {
      enderecos: []
    }
  }

  handleSubmit = async ({ cep }) => {
    try {
      const response = await apiViaCep.get(`/${cep}/json
      `);
      this.setState({ enderecos: response.data });
    } catch (error) {
      Swal.fire({
        title: error,
        icon: 'error',
        text: "Cep não encontrado!"
      });
    }
  }

  render() {
    return(
      <>
        <main>
          <div className="col-md-4 col-sm-6 my-3 container text-center">
            <h2>Procure um endereço via CEP</h2>
            <Formik initialValues={{ cep: '' }} onSubmit={this.handleSubmit}>
              <Form>
                <Field placeholder="Insira o número do cep" required type="text" name="cep" id="cep" className="form-control my-3" />
                <button type="submit" className="btn btn-primary">Pesquisar</button>
              </Form>
            </Formik><br />
            <div>
              <div>{this.state.enderecos.cep}</div>
              <div>{this.state.enderecos.logradouro}</div>
              <div>{this.state.enderecos.complemento}</div>
              <div>{this.state.enderecos.bairro}</div>
              <div>{this.state.enderecos.localidade}</div>
              <div>{this.state.enderecos.uf}</div>
            </div>
          </div>
          <div>
          <div className="container">
            <Link to="/BrasilApi">Ir para BrasilApi</Link>
          </div>
          </div>
        </main>
      </>
    );
  }
}