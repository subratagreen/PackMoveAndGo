package com.packmoveandgo.dao;

import java.sql.Date;
import java.util.List;

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

public interface PackMoveAndGoDao {

	int customerRegister(CustomerRegister customerRegister);
	long saveLoginInformation(Login login);
	boolean userLogin(Login login);
	int addBranch(Branch branch);
	List<Branch> getBranchList();
	int addAgent(BusinessPartner partner);
	int addServices(Services services);
	int addItem(Item item);
	List<BusinessPartner> getAgentList();
	List<Item> getItemList();
	List<Services> getServiceList();
	int addBooking(Booking booking);
	int addMaterialUsed(MaterialUsed materials);
	int addPackingMaterials(PackingMaterials packingMaterials);
	int addShipment(Shipment shipment);
	int addAddOrder(Order order);
	Services getServiceDetailByServiceId(int service_id);
	int addRate(Rate rate);
	int getAddEnquiryDetail(Enquiry enquiry);
	Order getOrderDetail(int orderId);
	CustomerRegister getCustomerDetailById(int cust_id);
	Booking getBookingDetailById(int cust_id);
	Branch getBranchDetailById(int branch_id);
	BusinessPartner getBusinessPartnerDetailById(int dest_agent_id);
	Item getItemDetailById(int item_id);
	Shipment getShipmentDetailById(int booking_id);
	Rate getRateDetailById(int item_id);
	int updateConsignmentStatus(Booking booking);
	int getOrderIdByBookingId(int bookingId);
	List<MyJoinTableData> getAllOrderDetailsByCustomerName(String customerName);
	void updateOrderDetail(Order order);
	long saveSendEnquiry(SendEnquiry sendEnquiry);
	List<MyJoinTableData> getAllDetailByMonthlyDate(Date monthlyDate);
	List<MyJoinTableData> getAllDetailByYearlyDate(Date startDate, Date endDate);
	List<MyJoinTableData> getAllDetailByDatewiseDate(Date datewise);
	List<SendEnquiry> getAllEnquiries();

}
