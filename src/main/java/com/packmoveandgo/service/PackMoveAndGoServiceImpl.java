package com.packmoveandgo.service;

import java.sql.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.packmoveandgo.dao.PackMoveAndGoDao;
import com.packmoveandgo.model.Booking;
import com.packmoveandgo.model.Branch;
import com.packmoveandgo.model.BusinessPartner;
import com.packmoveandgo.model.CustomerRegister;
import com.packmoveandgo.model.Enquiry;
import com.packmoveandgo.model.Item;
import com.packmoveandgo.model.Login;
import com.packmoveandgo.model.MaterialUsed;
import com.packmoveandgo.model.Order;
import com.packmoveandgo.model.PackingMaterials;
import com.packmoveandgo.model.Rate;
import com.packmoveandgo.model.SendEnquiry;
import com.packmoveandgo.model.Services;
import com.packmoveandgo.model.Shipment;
import com.packmoveandgo.request.model.MyJoinTableData;

@Service("packMoveAndGoService")
public class PackMoveAndGoServiceImpl implements PackMoveAndGoService {
	private static final Logger logger = Logger.getLogger(PackMoveAndGoServiceImpl.class);

	@Autowired
	private PackMoveAndGoDao packMoveAndGoDao;

	@Transactional
	public int CustomerRegister(CustomerRegister customerRegister) {
		return packMoveAndGoDao.customerRegister(customerRegister);
	}

	@Transactional
	@Override
	public long saveLoginInformation(Login login) {
		return packMoveAndGoDao.saveLoginInformation(login);
	}

	@Transactional
	@Override
	public boolean userLogin(Login login) {
		return packMoveAndGoDao.userLogin(login);
	}


	@Transactional
	@Override
	public int addBranch(Branch branch) {
		return packMoveAndGoDao.addBranch(branch);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Branch> getBranchList() {
		return packMoveAndGoDao.getBranchList();
	}

	@Transactional
	@Override
	public int addAgent(BusinessPartner partner) {
		return packMoveAndGoDao.addAgent(partner);
	}

	@Transactional
	@Override
	public int addServices(Services services) {
		return packMoveAndGoDao.addServices(services);
	}

	@Transactional
	@Override
	public int addItem(Item item) {
		return packMoveAndGoDao.addItem(item);
	}

	@Transactional(readOnly = true)
	@Override
	public List<BusinessPartner> getAgentList() {
		return packMoveAndGoDao.getAgentList();
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<Item> getItemList() {
		return packMoveAndGoDao.getItemList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Services> getServiceList() {
		return packMoveAndGoDao.getServiceList();
	}

	@Transactional
	@Override
	public int addBooking(Booking booking) {
		return packMoveAndGoDao.addBooking(booking);
	}

	@Transactional
	@Override
	public int addMaterialUsed(MaterialUsed  materialUsed) {
		return packMoveAndGoDao.addMaterialUsed(materialUsed);
	}

	@Transactional
	@Override
	public int addPackingMaterials(PackingMaterials packingMaterials) {
		return packMoveAndGoDao.addPackingMaterials(packingMaterials);
	}
	@Transactional
	@Override
	public int addShipment(Shipment shipment) {
		return packMoveAndGoDao.addShipment(shipment);
	}
	@Transactional
	@Override
	public int addOrder(Order order) {
		return packMoveAndGoDao.addAddOrder(order);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Services getServiceDetailByServiceId(int service_id) {
		return packMoveAndGoDao.getServiceDetailByServiceId(service_id);
	}
	@Transactional
	@Override
	public int addRate(Rate rate) {
		return packMoveAndGoDao.addRate(rate);
	}
	@Transactional
	@Override
	public int getAddEnquiryDetail(Enquiry enquiry) {
		return packMoveAndGoDao.getAddEnquiryDetail(enquiry);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Order getOrderDetail(int orderId) {
		return packMoveAndGoDao.getOrderDetail(orderId);
	}
	
	@Transactional(readOnly = true)
	@Override
	public com.packmoveandgo.model.CustomerRegister getCustomerDetailById(int cust_id) {
		return packMoveAndGoDao.getCustomerDetailById(cust_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Booking getBookingDetailById(int cust_id) {
		return packMoveAndGoDao.getBookingDetailById(cust_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Branch getBranchDetailById(int branch_id) {
		return packMoveAndGoDao.getBranchDetailById(branch_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public BusinessPartner getBusinessPartnerDetailById(int dest_agent_id) {
		return packMoveAndGoDao.getBusinessPartnerDetailById(dest_agent_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Item getItemDetailById(int item_id) {
		return packMoveAndGoDao.getItemDetailById(item_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Shipment getShipmentDetailById(int booking_id) {
		return packMoveAndGoDao.getShipmentDetailById(booking_id);
	}
	
	@Transactional(readOnly = true)
	@Override
	public Rate getRateDetailById(int item_id) {
		return packMoveAndGoDao.getRateDetailById(item_id);
	}

	@Transactional
	@Override
	public int updateConsignmentStatus(Booking booking) {
		return packMoveAndGoDao.updateConsignmentStatus(booking);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public int getOrderIdByBookingId(int bookingId) {
		return packMoveAndGoDao.getOrderIdByBookingId(bookingId);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<MyJoinTableData> getAllOrderDetailsByCustomerName(String customerName) {
		return packMoveAndGoDao.getAllOrderDetailsByCustomerName(customerName);
	}

	@Transactional
	@Override
	public void updateOrderDetail(Order order) {
		 packMoveAndGoDao.updateOrderDetail(order);
	}
	
	@Transactional
	@Override
	public long saveSendEnquiry(SendEnquiry sendEnquiry) {
		return  packMoveAndGoDao.saveSendEnquiry(sendEnquiry);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<MyJoinTableData> getAllDetailByMonthlyDate(Date monthlyDate) {
		return packMoveAndGoDao.getAllDetailByMonthlyDate( monthlyDate);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<MyJoinTableData> getAllDetailByYearlyDate(Date startDate, Date endDate) {
		return packMoveAndGoDao.getAllDetailByYearlyDate( startDate,endDate);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<MyJoinTableData> getAllDetailByDatewiseDate(Date datewise) {
		return packMoveAndGoDao.getAllDetailByDatewiseDate(datewise);
	}

	@Transactional(readOnly = true)
	@Override
	public List<SendEnquiry> getAllEnquiries() {
		return packMoveAndGoDao.getAllEnquiries();
	}
}
