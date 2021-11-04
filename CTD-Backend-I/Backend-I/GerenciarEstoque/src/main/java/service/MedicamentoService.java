package service;

import dao.IDao;
import model.Medicamento;

public class MedicamentoService {
    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento salvar(Medicamento medicamento) {
        return medicamentoIDao.salvar(medicamento);
    }
}
