/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processor;

import Controller.ChiTietHoaDonCTR;
import Controller.GoiTapCTR;
import Controller.GoiTapHoanChinhCTR;
import Controller.HoaDonCTR;
import Controller.HoiVienCTR;
import Controller.LoaiGoiTapCTR;
import Controller.NhanVienCTR;
import Controller.TaiKhoanCTR;
import Controller.VoucherKMCTR;
import Object.ChiTietHoaDon;
import Object.GoiTapHoanChinh;
import Object.HoaDon;
import Object.HoiVien;
import Object.NhanVien;
import Object.VoucherKM;
import View.Dialog.SuccessDialog;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelExport {
    HoiVienCTR hvc = new HoiVienCTR();
    GoiTapCTR gtc = new GoiTapCTR();
    LoaiGoiTapCTR lgtc = new LoaiGoiTapCTR();
    NhanVienCTR nvc = new NhanVienCTR();
    HoiVienCTR hvctr = new HoiVienCTR();
    TaiKhoanCTR tkc = new TaiKhoanCTR();
    HoaDonCTR hdc = new HoaDonCTR();
    VoucherKMCTR vcc = new VoucherKMCTR();
    ChiTietHoaDonCTR cthdc = new ChiTietHoaDonCTR();
    GoiTapHoanChinhCTR gthcc = new GoiTapHoanChinhCTR();
    public ExelExport() {}
    public void ExportBill() {
        File fileLocation = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose location");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bills");
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Bills list");
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Bill ID");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Create date");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Customer ID");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Staff");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Total price");
            ArrayList<HoaDon> listItem = hdc.getData();
            for (int i = 0; i < listItem.size(); i++) {
                HoaDon hd = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(hd.getMaHD());
                row.createCell(2).setCellValue(hd.getNgayLap());
                row.createCell(3).setCellValue(hvctr.getData(hd.getMaHV()).getTenHV());
                row.createCell(4).setCellValue(hd.getMaNV());
                row.createCell(5).setCellValue(hdc.getPriceByMaHD(hd.getMaHD()));
            }
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                fileLocation = chooser.getSelectedFile();
                FileOutputStream out = new FileOutputStream(new File(fileLocation + "/BillDetails.xlsx"));
                workbook.write(out);
                out.close();
                new SuccessDialog("BillDetails.xlsx is succeessfully export!").setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ExportBillDetail() {
        File fileLocation = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose location");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bills detail");
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Bills detail list");
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Bill ID");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Create date");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Staff ID");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Customer ID");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Customer name");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Customer tel");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Customer email");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Package");
            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Package type");
            cell = row.createCell(10, CellType.STRING);
            cell.setCellValue("Start date");
            cell = row.createCell(11, CellType.STRING);
            cell.setCellValue("End date");
            cell = row.createCell(12, CellType.STRING);
            cell.setCellValue("Voucher");
            cell = row.createCell(13, CellType.STRING);
            cell.setCellValue("Price");
            ArrayList<ChiTietHoaDon> listItem = cthdc.getData();
            for (int i = 0; i < listItem.size(); i++) {
                ChiTietHoaDon cthd = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(cthd.getMaHD());
                row.createCell(2).setCellValue(hdc.getDataByMaHD(cthd.getMaHD()).getNgayLap());
                row.createCell(3).setCellValue(hdc.getDataByMaHD(cthd.getMaHD()).getMaNV());
                row.createCell(4).setCellValue(hdc.getDataByMaHD(cthd.getMaHD()).getMaHV());
                row.createCell(5).setCellValue(hvctr.getData(hdc.getDataByMaHD(cthd.getMaHD()).getMaHV()).getTenHV());
                row.createCell(6).setCellValue(hvctr.getData(hdc.getDataByMaHD(cthd.getMaHD()).getMaHV()).getSDT());
                row.createCell(7).setCellValue(hvctr.getData(hdc.getDataByMaHD(cthd.getMaHD()).getMaHV()).getEmail());
                row.createCell(8).setCellValue(gtc.getData(cthd.getMaGoiTap()).getTenGoiTap());
                row.createCell(9).setCellValue(lgtc.getTenLoaiGoiTap(cthd.getMaLoaiGoiTap()));
                row.createCell(10).setCellValue(cthd.getNgayBatDau());
                row.createCell(11).setCellValue(cthd.getNgayKetThuc());
                row.createCell(12).setCellValue(cthd.getMaVoucher());
                row.createCell(13).setCellValue(cthd.getGiaCuoi());
            }

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                fileLocation = chooser.getSelectedFile();
                FileOutputStream out = new FileOutputStream(new File(fileLocation + "/BillDetails.xlsx"));
                workbook.write(out);
                out.close();
                new SuccessDialog("BillDetails.xlsx is succeessfully export!").setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ExportPackage() {
        File fileLocation = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose location");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Package");
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Package list");
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Package name");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Package type");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Package price");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Package detail");
            ArrayList<GoiTapHoanChinh> listItem = gthcc.getData();
            for (int i = 0; i < listItem.size(); i++) {
                GoiTapHoanChinh gt = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(gtc.getData(gt.getMaGoiTap()).getTenGoiTap());
                row.createCell(2).setCellValue(lgtc.getDataByMaLoaiGoiTap(gt.getMaLoaiGoiTap()).getTenLoaiGoiTap());
                row.createCell(3).setCellValue(gt.getGiaGoiTap());
                row.createCell(4).setCellValue(gtc.getData(gt.getMaGoiTap()).getChiTietGoiTap());
            }

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                fileLocation = chooser.getSelectedFile();
                FileOutputStream out = new FileOutputStream(new File(fileLocation + "/Package.xlsx"));
                workbook.write(out);
                out.close();
                new SuccessDialog("Package.xlsx is succeessfully export!").setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ExportCustomer() {
        File fileLocation = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose location");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bills");
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Customer list");
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Customer ID");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Date of birth");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Address");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Phone");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Email");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Sex");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Facebook");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("ID card");
            ArrayList<HoiVien> listItem = hvc.getData();
            for (int i = 0; i < listItem.size(); i++) {
                HoiVien hv = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(hv.getTenHV());
                row.createCell(2).setCellValue(hv.getNgaySinh());
                row.createCell(3).setCellValue(hv.getDiaChi());
                row.createCell(4).setCellValue(hv.getSDT());
                row.createCell(5).setCellValue(hv.getEmail());
                row.createCell(6).setCellValue(hv.getGioiTinh());
                row.createCell(7).setCellValue(hv.getFaceBook());
                row.createCell(8).setCellValue(hv.getCMND());
            }
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                fileLocation = chooser.getSelectedFile();
                FileOutputStream out = new FileOutputStream(new File(fileLocation + "/Customer.xlsx"));
                workbook.write(out);
                out.close();
                new SuccessDialog("Customer.xlsx is succeessfully export!").setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ExportStaff() {
        File fileLocation = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose location");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bills");
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Staff list");
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Staff ID");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Staff Name");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Email");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Address");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Phone");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Sex");
            ArrayList<NhanVien> listItem = nvc.getData();
            for (int i = 0; i < listItem.size(); i++) {
                NhanVien nv = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(nv.getMaNV());
                row.createCell(2).setCellValue(nv.getTenNV());
                row.createCell(3).setCellValue(nv.getEmail());
                row.createCell(4).setCellValue(nv.getDiaChi());
                row.createCell(5).setCellValue(nv.getSDT());
                row.createCell(6).setCellValue(nv.getGioiTinh());
            }
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                fileLocation = chooser.getSelectedFile();
                FileOutputStream out = new FileOutputStream(new File(fileLocation + "/Staff.xlsx"));
                workbook.write(out);
                out.close();
                new SuccessDialog("Staff.xlsx is succeessfully export!").setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void ExportVoucher() {
        File fileLocation = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));
        chooser.setDialogTitle("Choose location");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Bills");
            XSSFRow row = null;
            Cell cell = null;
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Staff list");
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Voucher");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Package");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Package type");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Discount (%)");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Discount (direct)");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Bonus day(s)");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Apply date");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("End date");

            ArrayList<VoucherKM> listItem = vcc.getData();
            for (int i = 0; i < listItem.size(); i++) {
                VoucherKM vc = listItem.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(vc.getMaVoucher());
                row.createCell(2).setCellValue(gtc.getData(vc.getMaGoiTap()).getTenGoiTap());
                row.createCell(3).setCellValue(lgtc.getTenLoaiGoiTap(vc.getMaLoaiGoiTap()));
                row.createCell(4).setCellValue(vc.getGiamGia1());
                row.createCell(5).setCellValue(vc.getGiamGia2());
                row.createCell(6).setCellValue(vc.getThemNgay());
                row.createCell(7).setCellValue(vc.getNgayBatDau());
                row.createCell(8).setCellValue(vc.getNgayKetThuc());
            }
//           
            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                fileLocation = chooser.getSelectedFile();
                FileOutputStream out = new FileOutputStream(new File(fileLocation + "/Voucher.xlsx"));
                workbook.write(out);
                out.close();
                new SuccessDialog("Voucher.xlsx is succeessfully export!").setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
