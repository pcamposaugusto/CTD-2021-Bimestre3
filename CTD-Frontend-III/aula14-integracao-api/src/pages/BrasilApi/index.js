import { Component } from 'react';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import apiBrasil from '../../service/apiBrasil';
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
      const response = await apiBrasil.get(`${cep}
      `);
      this.setState({ enderecos: response.data });
    } catch (error) {
      Swal.fire({
        title: error.response.status,
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
              <div>{this.state.enderecos.street}</div>
              <div>{this.state.enderecos.neighborhood}</div>
              <div>{this.state.enderecos.city}</div>
              <div>{this.state.enderecos.state}</div>
            </div>
          </div>
          <div className="container">
            <Link to="/">Ir para ViaCep</Link>
          </div>
        </main>
      </>
    );
  }
}