package com.packmoveandgo.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
import com.packmoveandgo.util.PackeMoveAndGoUtils;


@Repository
public class PackMoveAndGoDaoImpl implements PackMoveAndGoDao {
	private static final Logger logger = Logger.getLogger(PackMoveAndGoDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int customerRegister(CustomerRegister customerRegister) {
		sessionFactory.getCurrentSession().save(customerRegister);
		logger.info("after save : user id's = "+customerRegister.getCust_id());
		return customerRegister.getCust_id();
	}

	@Override
	public long saveLoginInformation(Login login) {
		sessionFactory.getCurrentSession().save(login);
		logger.info("after save : saveLoginInformation id's = "+login.getCust_id());
		logger.info("after save : saveLoginInformation getLogin_serial_no  = "+login.getLogin_serial_no());
		return login.getLogin_serial_no();
	}

	@Override
	public boolean userLogin(Login login) {
		logger.info("Login USER ID "+login.getCust_id());
		logger.info("Login USER Password "+login.getPassword());
		logger.info("Login USER Type "+login.getCust_type());
		String hql = "FROM Login l WHERE l.cust_id = :cust_id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("cust_id",login.getCust_id());
		List results = query.list();

		for(Iterator it=query.iterate();it.hasNext();) {
			Login loginDb =	(Login)it.next();
			logger.info("========================================");
			logger.info("Login DB ID "+loginDb.getCust_id());
			logger.info("Login DB Password "+loginDb.getPassword());
			logger.info("Login DB Type "+loginDb.getCust_type());
			if (loginDb.getPassword().equalsIgnoreCase(login.getPassword())
					&&loginDb.getCust_type().equalsIgnoreCase(login.getCust_type())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int addBranch(Branch branch) {
		return (int) sessionFactory.getCurrentSession().save(branch);
	}

	@Override
	public List<Branch> getBranchList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Branch> query = builder.createQuery(Branch.class);
		Root<Branch> root = query.from(Branch.class);
		query.select(root);
		Query<Branch> q=sessionFactory.getCurrentSession().createQuery(query);
		List<Branch> branchs=q.getResultList();
		for (Branch branch : branchs) {
			logger.info("Branch Name ::"+branch.getBranch_name());
		}
		return branchs;
	}

	@Override
	public int addAgent(BusinessPartner partner) {
		return (int) sessionFactory.getCurrentSession().save(partner);
	}

	@Override
	public int addServices(Services services) {
		return (int) sessionFactory.getCurrentSession().save(services);
	}

	@Override
	public int addItem(Item item) {
		return (int) sessionFactory.getCurrentSession().save(item);
	}

	@Override
	public List<BusinessPartner> getAgentList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<BusinessPartner> query = builder.createQuery(BusinessPartner.class);
		Root<BusinessPartner> root = query.from(BusinessPartner.class);
		query.select(root);
		Query<BusinessPartner> q=sessionFactory.getCurrentSession().createQuery(query);
		return q.getResultList();
	}

	@Override
	public List<Item> getItemList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Item> query = builder.createQuery(Item.class);
		Root<Item> root = query.from(Item.class);
		query.select(root);
		Query<Item> q=sessionFactory.getCurrentSession().createQuery(query);
		return q.getResultList();
	}

	@Override
	public List<Services> getServiceList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Services> query = builder.createQuery(Services.class);
		Root<Services> root = query.from(Services.class);
		query.select(root);
		Query<Services> q=sessionFactory.getCurrentSession().createQuery(query);
		return q.getResultList();
	}

	@Override
	public int addBooking(Booking booking) {
		return (int) sessionFactory.getCurrentSession().save(booking);
	}

	@Override
	public int addMaterialUsed(MaterialUsed materialUsed) {
		return (int) sessionFactory.getCurrentSession().save(materialUsed);
	}

	@Override
	public int addPackingMaterials(PackingMaterials packingMaterials) {
		return (int) sessionFactory.getCurrentSession().save(packingMaterials);
	}
	@Override
	public int addShipment(Shipment shipment) {
		return (int) sessionFactory.getCurrentSession().save(shipment);
	}
	@Override
	public int addAddOrder(Order order) {
		return (int) sessionFactory.getCurrentSession().save(order);
	}
	@Override
	public Services getServiceDetailByServiceId(int service_id) {
		return sessionFactory.getCurrentSession().get(Services.class, service_id);
	}
	@Override
	public int addRate(Rate rate) {
		return (int) sessionFactory.getCurrentSession().save(rate);
	}
	@Override
	public int getAddEnquiryDetail(Enquiry enquiry) {
		return (int) sessionFactory.getCurrentSession().save(enquiry);
	}
	@Override
	public Order getOrderDetail(int orderId) {
		return sessionFactory.getCurrentSession().get(Order.class, orderId);
	}

	@Override
	public CustomerRegister getCustomerDetailById(int cust_id) {
		return sessionFactory.getCurrentSession().get(CustomerRegister.class, cust_id);
	}
	@Override
	public Booking getBookingDetailById(int cust_id) {
		String hql = "FROM Booking l WHERE l.cust_id = :cust_id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("cust_id",cust_id);
		return (Booking)query.getSingleResult();
	}
	@Override
	public Branch getBranchDetailById(int branch_id) {
		return sessionFactory.getCurrentSession().get(Branch.class, branch_id);
	}
	@Override
	public BusinessPartner getBusinessPartnerDetailById(int dest_agent_id) {
		return sessionFactory.getCurrentSession().get(BusinessPartner.class, dest_agent_id);
	}
	@Override
	public Item getItemDetailById(int item_id) {
		return sessionFactory.getCurrentSession().get(Item.class, item_id);
	}
	@Override
	public Shipment getShipmentDetailById(int booking_id) {
		String hql = "FROM Shipment l WHERE l.booking_id = :booking_id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("booking_id",booking_id);
		return (Shipment)query.getSingleResult();
	}
	@Override
	public Rate getRateDetailById(int item_id) {
		String hql = "FROM Rate l WHERE l.item_id = :item_id";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("item_id",item_id);
		return (Rate)query.getSingleResult();
	}

	@Override
	public int updateConsignmentStatus(Booking booking) {
		sessionFactory.getCurrentSession().update(booking);
		return 0;
	}
	@Override
	public int getOrderIdByBookingId(int bookingId) {
		logger.info("Return bookingId "+bookingId);
		Order order =null;
		String hql="FROM Order ord WHERE ord.cust_id=(SELECT bking.cust_id FROM Booking bking WHERE bking.booking_id=:booking_id)";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("booking_id",bookingId);

		try {
			order =(Order)query.getSingleResult();
			return order.getOrder_id();
		} catch (Exception e) {
			return 0;
		}
	}
	@Override
	public List<MyJoinTableData> getAllOrderDetailsByCustomerName(String customerName) {

		//HQL join examples
		String hql="SELECT cust,ord,bk,busp,br "
				+ "FROM CustomerRegister  cust inner join Order  ord "
				+ "on ord.cust_id = cust.cust_id inner join Booking  bk "
				+ "on bk.cust_id=cust.cust_id inner join BusinessPartner  busp "
				+ "on busp.agent_id=bk.dest_agent_id inner join Branch br "
				+ "on ord.branch_id=br.branch_id and cust.cust_name=:cust_name";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("cust_name",customerName);
		List<Object[]> rows=query.getResultList();

		for(Object[] arr : rows){
			logger.info(Arrays.toString(arr));
		}
		List<MyJoinTableData> result = new ArrayList<>(rows.size());

		for (Object[] row : rows) { 
			result.add(new MyJoinTableData(
					(CustomerRegister) row[0],
					(Order) row[1],
					(Booking) row[2],
					(BusinessPartner) row[3],
					(Branch) row[4]
					)); 
		}
		return result;
	}

	@Override
	public void updateOrderDetail(Order order) {
		sessionFactory.getCurrentSession().update(order);
	}

	@Override
	public long saveSendEnquiry(SendEnquiry sendEnquiry) {
		sessionFactory.getCurrentSession().save(sendEnquiry);
		logger.info("after save : sendEnquiry id's = "+sendEnquiry.getSendEnquiryId());
		return sendEnquiry.getSendEnquiryId();
	}

	@Override
	public List<MyJoinTableData> getAllDetailByMonthlyDate(Date monthlyDate) {
		//HQL join examples
		//2019-04-20
		String hql="SELECT cust,ord,bk,busp,br "
				+ "FROM CustomerRegister  cust inner join Order  ord "
				+ "on ord.cust_id = cust.cust_id inner join Booking  bk "
				+ "on bk.cust_id=cust.cust_id inner join BusinessPartner  busp "
				+ "on busp.agent_id=bk.dest_agent_id inner join Branch br "
				+ "on ord.branch_id=br.branch_id and "
				+ "EXTRACT( MONTH FROM bk.booking_date ) = :month_as_string AND "
				+ "EXTRACT( YEAR FROM bk.booking_date ) = :year_as_string ";
		logger.info("month_as_string "+PackeMoveAndGoUtils.getMonthFromDate(monthlyDate));
		logger.info("year_as_string "+PackeMoveAndGoUtils.getYearFromDate(monthlyDate));
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("month_as_string",PackeMoveAndGoUtils.getMonthFromDate(monthlyDate));
		query.setParameter("year_as_string",PackeMoveAndGoUtils.getYearFromDate(monthlyDate));

		List<Object[]> rows=query.getResultList();

		for(Object[] arr : rows){
			logger.info(Arrays.toString(arr));
		}
		List<MyJoinTableData> result = new ArrayList<>(rows.size());

		for (Object[] row : rows) { 
			result.add(new MyJoinTableData(
					(CustomerRegister) row[0],
					(Order) row[1],
					(Booking) row[2],
					(BusinessPartner) row[3],
					(Branch) row[4]
					)); 
		}
		return result;
	}

	@Override
	public List<MyJoinTableData> getAllDetailByYearlyDate(Date startDate,Date endDate) {
		//HQL join examples
		//2019-04-20
		String hql="SELECT cust,ord,bk,busp,br "
				+ "FROM CustomerRegister  cust inner join Order  ord "
				+ "on ord.cust_id = cust.cust_id inner join Booking  bk "
				+ "on bk.cust_id=cust.cust_id inner join BusinessPartner  busp "
				+ "on busp.agent_id=bk.dest_agent_id inner join Branch br "
				+ "on ord.branch_id=br.branch_id and bk.booking_date between :start_date_as_string and :end_date_as_string";
		
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("start_date_as_string",startDate);
		query.setParameter("end_date_as_string",endDate);
		List<Object[]> rows=query.getResultList();

		for(Object[] arr : rows){
			logger.info(Arrays.toString(arr));
		}
		List<MyJoinTableData> result = new ArrayList<>(rows.size());

		for (Object[] row : rows) { 
			result.add(new MyJoinTableData(
					(CustomerRegister) row[0],
					(Order) row[1],
					(Booking) row[2],
					(BusinessPartner) row[3],
					(Branch) row[4]
					)); 
		}
		return result;
	}
	
	@Override
	public List<MyJoinTableData> getAllDetailByDatewiseDate(Date datewise) {
		//HQL join examples
		//2019-04-20
		String hql="SELECT cust,ord,bk,busp,br "
				+ "FROM CustomerRegister  cust inner join Order  ord "
				+ "on ord.cust_id = cust.cust_id inner join Booking  bk "
				+ "on bk.cust_id=cust.cust_id inner join BusinessPartner  busp "
				+ "on busp.agent_id=bk.dest_agent_id inner join Branch br "
				+ "on ord.branch_id=br.branch_id and bk.booking_date =:date_as_string ";
		
		logger.info("datewise_as_string "+datewise);
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setParameter("date_as_string",datewise);
		List<Object[]> rows=query.getResultList();

		for(Object[] arr : rows){
			logger.info(Arrays.toString(arr));
		}
		List<MyJoinTableData> result = new ArrayList<>(rows.size());

		for (Object[] row : rows) { 
			result.add(new MyJoinTableData(
					(CustomerRegister) row[0],
					(Order) row[1],
					(Booking) row[2],
					(BusinessPartner) row[3],
					(Branch) row[4]
					)); 
		}
		return result;
	}

	@Override
	public List<SendEnquiry> getAllEnquiries() {
		// sendEnquiryId,name,mobile,moveFrom,moveTo,moveDate,message,email,status
		logger.info("Return getAllEnquiries ");
		return sessionFactory.getCurrentSession().createQuery("SELECT a FROM SendEnquiry a", SendEnquiry.class).getResultList();
	}
}