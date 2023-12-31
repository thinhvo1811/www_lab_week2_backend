package vn.edu.iuh.fit.week02_lab_voquocthinh_20078241.services;

import vn.edu.iuh.fit.week02_lab_voquocthinh_20078241.models.Employee;
import vn.edu.iuh.fit.week02_lab_voquocthinh_20078241.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAll();
    public List<Product> getProductsByKeyword(String keyword);
    public List<Product> getProductsByManufacturer(String manufacturer);
    public List<String> getAllManufacturers();
    public Optional<Product> findByID(long id);
    public boolean delete(long id);
    public boolean insert(Product product);
    public boolean update(Product product);
}
