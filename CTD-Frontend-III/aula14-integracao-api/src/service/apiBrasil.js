import axios from 'axios';

const apiBrasil = axios.create({
    baseURL: 'https://brasilapi.com.br/api/cep/v1'
});

export default apiBrasil;