package com.codeline.task3.Service;

import com.codeline.task3.DTO.InventoryReports;
import com.codeline.task3.Model.Inventory;
import com.codeline.task3.Model.Product;
import com.codeline.task3.Repository.InventoryRepository;
import com.codeline.task3.Repository.ProductRepository;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InventoryReportService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    InventoryRepository inventoryRepository;


    public static final String pathToReports = "C:\\Users\\user018\\Downloads\\reports";

    public String generateReport(String jasperReportName, String fileName, JRBeanCollectionDataSource dataSource) throws Exception {

        File file = ResourceUtils.getFile("classpath:InventoryReports.jrxml"); //classpath get the report
        JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath()); //File tell JR to compileReport
        Map<String, Object> paramters = new HashMap<>();
        paramters.put("CreatedBy", "Manal");
        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, paramters, dataSource); //print, format
        JasperExportManager.exportReportToPdfFile(jasperPrint, pathToReports + "\\InventoryReports.pdf");
        return "Report generated : " + pathToReports + "\\InventoryReports.pdf";


    }

    public String inventoryGenerateReports() throws FileNotFoundException, JRException  {
        List<Inventory> getAllInventory = inventoryRepository.getAllActiveInventory();

        List<InventoryReports> inventoryReport = new ArrayList<>();

        for (Inventory inventory : getAllInventory) {
            List<Product> getAllProductsByInventoryId = productRepository.getAllProductsByInventoryId(inventory.getInventoryId());
            for (Product product : getAllProductsByInventoryId) {
                InventoryReports inventoryReports = new InventoryReports();
                inventoryReports.setInventoryLocation(inventory.getInventoryLocation());
                inventoryReports.setProductName(product.getProductName());
                inventoryReports.setQuantityAvailable(product.getQuantityAvailable());
                inventoryReports.setReorderThreshold(product.getOrderProducts().getReorderThreshold());
                inventoryReport.add(inventoryReports);

            }

        }
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(inventoryReport);
        return "Report generated : " + pathToReports + "\\InventoryReports.pdf";

        }


    }


