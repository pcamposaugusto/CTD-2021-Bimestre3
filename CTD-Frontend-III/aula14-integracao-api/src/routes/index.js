import { BrowserRouter, Routes, Route } from 'react-router-dom';
import ViaCep from '../pages/ViaCep';
import BrasilApi from '../pages/BrasilApi';
import NotFound from '../pages/NotFound';

const RouteList = () => (
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<ViaCep />} />
      <Route path="/BrasilApi" element={<BrasilApi />} />
      <Route path="*" element={<NotFound />} />
    </Routes>
  </BrowserRouter>
);

export default RouteList;