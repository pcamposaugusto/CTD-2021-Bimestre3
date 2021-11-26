import { useState } from 'react';
import { Formik, Form, Field } from 'formik';
import Swal from 'sweetalert2';
import apiViaCep from '../../service/apiViaCep';
import { Link } from 'react-router-dom';

const ViaCep = () => {
  const [enderecos, setEnderecos] = useState([]);


  const handleSubmit = async ({ cep }) => {
    try {
      const response = await apiViaCep.get(`/${cep}/json
      `);
      setEnderecos(response.data);
    } catch (error) {
      Swal.fire({
        title: error.response.status,
        icon: 'error',
        text: "Cep não encontrado!"
      });
    }
  }

  return (
    <>
      <main>
        <div className="col-md-4 col-sm-6 my-3 container text-center">
          <h2>Procure um endereço via CEP</h2>
          <Formik initialValues={{ cep: '' }} onSubmit={handleSubmit}>
            <Form>
              <Field placeholder="Insira o número do cep" required type="text" name="cep" id="cep" className="form-control my-3" />
              <button type="submit" className="btn btn-primary">Pesquisar</button>
            </Form>
          </Formik><br />
          <div>
            <div>{enderecos.cep}</div>
            <div>{enderecos.logradouro}</div>
            <div>{enderecos.complemento}</div>
            <div>{enderecos.bairro}</div>
            <div>{enderecos.localidade}</div>
            <div>{enderecos.uf}</div>
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

export default ViaCep;