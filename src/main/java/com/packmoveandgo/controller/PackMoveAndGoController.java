package com.packmoveandgo.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.packmoveandgo.model.Booking;
import com.packmoveandgo.model.Branch;
import com.packmoveandgo.model.BusinessPartner;
import com.packmoveandgo.model.CustomerRegister;
import com.packmoveandgo.model.Enquiry;
import com.packmoveandgo.model.Item;
import com.packmoveandgo.model.MaterialUsed;
import com.packmoveandgo.model.Order;
import com.packmoveandgo.model.PackingMaterials;
import com.packmoveandgo.model.SendEnquiry;
import com.packmoveandgo.model.Services;
import com.packmoveandgo.model.Shipment;
import com.packmoveandgo.request.model.FastBooking;
import com.packmoveandgo.request.model.MISReport;
import com.packmoveandgo.request.model.MyJoinTableData;
import com.packmoveandgo.request.model.OrderDetails;
import com.packmoveandgo.request.model.TrackOrder;
import com.packmoveandgo.service.PackMoveAndGoService;
import com.packmoveandgo.util.Book;
import com.packmoveandgo.util.InvoiceGenerator;
import com.packmoveandgo.util.PackeMoveAndGoUtils;
import com.packmoveandgo.util.PrintReport;

@Controller
public class PackMoveAndGoController {

	private static final String TMP_FILES = "tmpFiles";

	private static final String CATALINA_HOME = "catalina.home";

	private static final String BOOKING_STATUS_CANCEL = "Booking STATUS CANCEL........";

	private static final String BOOKING_STATUS_ACTIVE = "Booking STATUS ACTIVE........";

	private static final String BOOKING_STATUS_UNKNOWN = "Booking STATUS UNKNOWN........";

	private static final Logger logger = Logger.getLogger(PackMoveAndGoController.class);
	
	private static final String NETWORK = "network";
	private static final String NETWORK_URL = "/network";
	private static final String PROCESS = "process";
	private static final String PROCESS_URL = "/process";
	private static final String ABOUT_US = "aboutUs";
	private static final String ABOUT_US_URL = "/aboutUs";
	private static final String CLIENTS = "clients";
	private static final String CLIENTS_URL = "/clients";
	private static final String DATABASE_BACKUP = "databaseBackup";
	private static final String DATABASE_BACKUP_URL = "/databaseBackup";
	private static final String CONTACT_US = "contactUs";
	private static final String CONTACT_US_URL = "/contactUs";
	private static final String INSURANCE_SERVICES = "insurance-services";
	private static final String INSURANCE_SERVICES_URL = "/insurance-services";
	private static final String WAREHOUSING_SERVICES = "warehousing-services";
	private static final String WAREHOUSING_SERVICES_URL = "/warehousing-services";
	private static final String TRANSPORTATION_SERVICES = "transportation-services";
	private static final String TRANSPORTATION_SERVICES_URL = "/transportation-services";
	private static final String PACKING_AND_MOVING_SERVICES = "packing-and-moving-services";
	private static final String PACKING_AND_MOVING_SERVICES_URL = "/packing-and-moving-services";
	private static final String OFFICE_AND_LOCAL_SHIFTING_SERVICES = "office-and-local-shifting-services";
	private static final String OFFICE_AND_LOCAL_SHIFTING_SERVICES_URL = "/office-and-local-shifting-services";
	private static final String LOADING_AND_UNLOADING_SERVICES = "loading-and-unloading-services";
	private static final String LOADING_AND_UNLOADING_SERVICES_URL = "/loading-and-unloading-services";
	private static final String CAR_CARRIER_SERVICES = "car-carrier-services";
	private static final String CAR_CARRIER_SERVICES_URL = "/car-carrier-services";
	private static final String BALANCE = "balance";
	private static final String BALANCE_URL = "/balance";
	private static final String DOCUMENTATION_URL = "/documentation";
	private static final String SERVICES_URL = "/services";
	private static final String LOGOUT_URL = "/logout";
	private static final String MIS_REPORT = "misReport";
	private static final String MIS_REPORT_URL = "/misReport";
	private static final String INDEX = "index";
	private static final String SERVICES = "services";
	private static final String SEND_ENQUIRY_URL = "/sendEnquiry";
	private static final String UPLOAD_MULTIPLE_FILE_URL = "/uploadMultipleFile";
	private static final String PROOF_OF_DELIVERY_URL = "/proofOfDelivery";
	private static final String PROOF_OF_DELIVERY_LIST = "proofOfDeliveryList";
	private static final String PROOF_OF_DELIVERY_SEARCH = "proofOfDeliverySearch";
	private static final String PROOF_OF_DELIVERY_SEARCH_URL = "/proofOfDeliverySearch";
	private static final String CANCELORDER_URL = "/cancelorder";
	private static final String ADVANCE_SEARCH_UPDATE_CONSIGNMENT_STATUS_URL = "/advanceSearchUpdateConsignmentStatus";
	private static final String ADVANCE_SEARCH_VIEW_ORDER = "advanceSearchViewOrder";
	private static final String ADVANCE_SEARCH_VIEW_ORDER_URL = "/advanceSearchViewOrder";
	private static final String DETAILS = "details";
	private static final String ADVANCE_SEARCH_LIST = "advanceSearchList";
	private static final String ORDER_DETAILS_LIST = "orderDetailsList";
	private static final String ADVANCE_SEARCH = "advanceSearch";
	private static final String ADVANCE_SEARCH_URL = "/advanceSearch";
	private static final String UPDATE_CONSIGNMENT_STATUS_URL = "/updateConsignmentStatus";
	private static final String VIEW_ORDER = "viewOrder";
	private static final String VIEWORDER_URL = "/vieworder";
	private static final String PAYMENT_RECEIPT_URL = "/paymentReceipt";
	private static final String CONSIGNMENT_BILL_URL = "/consignmentBill";
	private static final String WAY_BILL_URL = "/wayBill";
	private static final String TRACK_ORDER_LIST = "trackOrderList";
	private static final String TRACK_ORDER = "trackOrder";
	private static final String TRACK_ORDER_URL = "/trackOrder";
	private static final String ORDERLIST = "orderlist";
	private static final String CONSIGNMENT_STATUS = "consignmentStatus";
	private static final String CONSIGNMENT_STATUS_URL = "/consignmentStatus";
	private static final String ENQUIRY = "enquiry";
	private static final String ENQUIRY_URL = "/enquiry";
	private static final String LIST_BOOKS = "listBooks";
	private static final String VIEW_PDF = "viewPDF";
	private static final String DOWNLOAD_PDF_URL = "/downloadPDF";
	private static final String DOCUMENTATION = "documentation";
	private static final String MESSAGE = "message";
	private static final String ORDER_ID = "order_id";
	private static final String ORDER2 = "Order";
	private static final String TRANSIT = "Transit ";
	private static final String DELIVERED = "Delivered ";
	private static final String UNKNOWN = "Unkonown";
	private static final String BOOKING_IS_CANCELED = "Booking is Canceled";
	private static final String BOOKING_IS_ACTIVE = "Booking is Active";
	private static final String FAST_BOOKING_URL = "/fastBooking";
	private static final String FAST_BOOKING = "fastBooking";
	@Autowired
	private PackMoveAndGoService packMoveAndGoService;

	@ModelAttribute("branchList")
	public List<Branch> getBranchListOptions(){
		return packMoveAndGoService.getBranchList();
	}

	@ModelAttribute("agentList")
	public List<BusinessPartner> getAgentListOptions(){
		return packMoveAndGoService.getAgentList();
	}

	@ModelAttribute("itemList")
	public List<Item> getItemListOptions(){
		return packMoveAndGoService.getItemList();
	}

	@ModelAttribute("serviceList")
	public List<Services> getServiceListOptions(){
		return packMoveAndGoService.getServiceList();
	}

	@GetMapping("/") public String index() {
		logger.info("index called .......!!!"); return INDEX; }


	@GetMapping(FAST_BOOKING_URL)
	public String fastBooking() {
		logger.info("fastBooking called .......!!!");
		return FAST_BOOKING;
	}

	@PostMapping(FAST_BOOKING_URL)
	public String fastBookingAction(@ModelAttribute(FAST_BOOKING) @Valid FastBooking fastBooking,BindingResult result,
			Model model,HttpServletRequest httpServletRequest) throws FileNotFoundException {
		logger.info("fastBooking called .......!!!"+fastBooking.toString());
		List<Services> servicesList = packMoveAndGoService.getServiceList();
		
		CustomerRegister customerRegister=new CustomerRegister();
		customerRegister.setCust_address(fastBooking.getCust_address());
		customerRegister.setCust_credit_limit(4);
		customerRegister.setCust_name(fastBooking.getCust_name());
		customerRegister.setCust_ph(fastBooking.getCust_ph());
		customerRegister.setCust_type(fastBooking.getCust_type());

		int id=	packMoveAndGoService.CustomerRegister(customerRegister);
		logger.info("Generated Customer ID "+id);
		if (id>0) {
			logger.info("Generated Customer ID "+customerRegister.getCust_id());

			Booking booking=new Booking();
			booking.setBranch_id(fastBooking.getBranch_id());
			booking.setBooking_date(fastBooking.getBooking_date());
			booking.setCust_id(customerRegister.getCust_id());
			booking.setDest_agent_id(fastBooking.getDest_agent_id());
			booking.setDest_branch(fastBooking.getDest_branch());
			booking.setPack_load_unload(fastBooking.getPack_load_unload());
			for (Services services : servicesList) {
				if (services.getService_id()==fastBooking.getService_id()) {
					fastBooking.setRate(services.getCharge_per_km());
					break;
				}
			}
			logger.info("fastBooking.getRate() "+fastBooking.getRate());
			booking.setRate(fastBooking.getRate());
			booking.setSrc_branch(fastBooking.getSrc_branch());
			int bookingId=	packMoveAndGoService.addBooking(booking);
			logger.info("Generated Booking ID "+bookingId);
			if (bookingId>0) {
				logger.info("Generated Booking ID "+booking.getBooking_id());
				MaterialUsed materialUsed=new MaterialUsed();
				materialUsed.setBranch_id(fastBooking.getBranch_id());
				materialUsed.setQty(fastBooking.getQty());
				int materialUsedId=	packMoveAndGoService.addMaterialUsed(materialUsed);
				logger.info("Generated materialUsedId ID "+materialUsedId);
				if (materialUsedId>0) {
					logger.info("Generated Material Used ID "+materialUsed.getMat_id());
					PackingMaterials packingMaterials=new PackingMaterials();
					packingMaterials.setCost_per_unit(fastBooking.getCost_per_unit());
					packingMaterials.setPack_mat_desc(fastBooking.getPack_mat_desc());
					packingMaterials.setMat_id(materialUsed.getMat_id());
					int materialsId=packMoveAndGoService.addPackingMaterials(packingMaterials);
					logger.info("Generated materialsId ID "+materialsId);
					if (materialsId>0) {
						logger.info("Generated Pack Material ID "+packingMaterials.getPack_mat_id());
						Shipment shipment=new Shipment();
						shipment.setBranch_id(fastBooking.getBranch_id());
						shipment.setItem_id(fastBooking.getItem_id());
						shipment.setQty(fastBooking.getQty());
						shipment.setBooking_id(booking.getBooking_id());
						int shipmentId=	packMoveAndGoService.addShipment(shipment);
						if (shipmentId>0) {
							logger.info("Generated Shipment ID "+shipment.getShipment_id());
							Order order=new Order();
							order.setBranch_id(fastBooking.getBranch_id());
							order.setCust_id(customerRegister.getCust_id());
							order.setItem_id(fastBooking.getItem_id());
							order.setApprox_expend(fastBooking.getApprox_expend());
							order.setQty(fastBooking.getQty());
							order.setStatus("A");
							int orderId= packMoveAndGoService.addOrder(order);

							if (orderId>0) {
								OrderDetails orderDetails=new OrderDetails();
								orderDetails.setCust_name(customerRegister.getCust_name());
								orderDetails.setOrder_id(orderId);
								orderDetails.setBooking_date(booking.getBooking_date());
								logger.info("booking.getRate() "+booking.getRate());
								orderDetails.setRate(booking.getRate());
								orderDetails.setQty(fastBooking.getQty());
								orderDetails.setItem_id(fastBooking.getItem_id());
								List<BusinessPartner> partnersList= packMoveAndGoService.getAgentList();
								for (BusinessPartner businessPartner : partnersList) {
									if (businessPartner.getAgent_id()==booking.getDest_agent_id()) {
										orderDetails.setAgent_name(businessPartner.getAgent_name());
										break;
									}
								}
								if ( order.getStatus().equalsIgnoreCase("A") ) {
									logger.info(BOOKING_STATUS_ACTIVE);
									orderDetails.setStatus(BOOKING_IS_ACTIVE);
								} else if (order.getStatus().equalsIgnoreCase("D") ) {
									logger.info(BOOKING_STATUS_CANCEL);
									orderDetails.setStatus(BOOKING_IS_CANCELED);
								}else{
									logger.info(BOOKING_STATUS_UNKNOWN);
									orderDetails.setStatus(UNKNOWN);
								}
								List<Branch> list= packMoveAndGoService.getBranchList();
								for (Branch branch : list) {
									if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {
										orderDetails.setSrc_branch(branch.getBranch_name());
									}
									if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
										orderDetails.setDest_branch(branch.getBranch_name());
									}
									if(branch.getBranch_id()==booking.getBranch_id()) {
										orderDetails.setBranch_name(branch.getBranch_name());
									}
								}
								if(orderDetails.getBranch_name().equalsIgnoreCase(orderDetails.getSrc_branch())) {
									orderDetails.setStatusOfConsignment(ORDER2);
								}else if(orderDetails.getBranch_name().equalsIgnoreCase(orderDetails.getDest_branch())) {
									orderDetails.setStatusOfConsignment(DELIVERED);
								}else {
									orderDetails.setStatusOfConsignment(TRANSIT);
								}

								List<Item> itemsList= packMoveAndGoService.getItemList();
								for (Item item : itemsList) {
									if (item.getItem_id()==fastBooking.getItem_id()) {
										orderDetails.setItem_name(item.getItem_name());
										break;
									}
								}

								logger.info("Generated Shipment ID "+order.getOrder_id());

								model.addAttribute(ORDER_ID, order.getOrder_id());
								model.addAttribute(MESSAGE, "Order has been successfully Placed" +
										" Please Note down Generated Order Id "+orderId);

								String way_bill_pdfFilePath = PackeMoveAndGoUtils.getFilePath(httpServletRequest)
										+ File.separator + "way_bill_oder_id_"+orderId+".pdf"; 

								logger.info("Absolute Path Of The way_bill_pdfFilePath .PDF File Is?= " + way_bill_pdfFilePath);

								String consignment_bill_pdfFilePath = PackeMoveAndGoUtils.getFilePath(httpServletRequest)
										+ File.separator + "consignment_bill_oder_id_"+orderId+".pdf"; 

								logger.info("Absolute Path Of The consignment_bill_pdfFilePath .PDF File Is?= " + consignment_bill_pdfFilePath);

								String payment_receipt_pdfFilePath = PackeMoveAndGoUtils.getFilePath(httpServletRequest)
										+ File.separator + "payment_receipt_oder_id_"+orderId+".pdf"; 

								logger.info("Absolute Path Of The payment_receipt_pdfFilePath .PDF File Is?= " + payment_receipt_pdfFilePath);

								InvoiceGenerator wayBillGenerateInvoice = new InvoiceGenerator(way_bill_pdfFilePath, orderDetails);
								wayBillGenerateInvoice.createPDF(httpServletRequest);
								
								InvoiceGenerator consignmentBillGenerateInvoice = new InvoiceGenerator(consignment_bill_pdfFilePath, orderDetails);
								consignmentBillGenerateInvoice.createPDF(httpServletRequest);
								
								InvoiceGenerator paymentGenerateInvoice = new InvoiceGenerator(payment_receipt_pdfFilePath, orderDetails);
								paymentGenerateInvoice.createPDF(httpServletRequest);
								return DOCUMENTATION;
							}else {
								return FAST_BOOKING;
							}
						}else {
							return FAST_BOOKING;
						}
					}else {
						return FAST_BOOKING;
					}
				}else {
					return FAST_BOOKING;
				}
			}else {
				return FAST_BOOKING;
			}
		}else {
			return FAST_BOOKING;
		}
	}

	/**
	 * Handle request to download a PDF document
	 */
	@RequestMapping(value = DOWNLOAD_PDF_URL, method = RequestMethod.GET)
	public ModelAndView downloadExcel() {
		// create some sample data
		List<Book> listBooks = new ArrayList<Book>();
		listBooks.add(new Book("Spring in Action", "Craig Walls", "1935182358",
				"June 29th 2011", 31.98F));
		listBooks.add(new Book("Spring in Practice", "Willie Wheeler, Joshua White",
				"1935182056", "May 16th 2013", 31.95F));
		listBooks.add(new Book("Pro Spring 3",
				"Clarence Ho, Rob Harrop", "1430241071", "April 18th 2012", 31.85F));
		listBooks.add(new Book("Spring Integration in Action", "Mark Fisher", "1935182439",
				"September 26th 2012", 28.73F));

		// return a view which will be resolved by an excel view resolver
		return new ModelAndView(VIEW_PDF, LIST_BOOKS, listBooks);
	}


	@GetMapping(ENQUIRY_URL)
	public String enquiry() {
		logger.info("enquiry called .......!!!");
		return ENQUIRY;
	}	

	@PostMapping(ENQUIRY_URL)
	public String enquiryAction(@ModelAttribute(FAST_BOOKING) @Valid Enquiry enquiry,
			Model model,HttpServletRequest httpServletRequest) {
		logger.info("enquiryAction called .......!!!");
		int id=	packMoveAndGoService.getAddEnquiryDetail(enquiry);
		logger.info("Generated Enquiry ID "+id);
		if (id>0) {
			logger.info("Generated Enquiry ID "+enquiry.getEnq_id());
			model.addAttribute(MESSAGE, "Your Ticket Generated,We will contact as soon as possible "
					+ "Your Ticket Number is "+enquiry.getEnq_id());
			return ENQUIRY;
		}else {
			model.addAttribute(MESSAGE, "Opps! Some thing went worng .........!!!!!!");
			return ENQUIRY;
		}
	}	
	@GetMapping(CONSIGNMENT_STATUS_URL)
	public String consignmentStatus() {
		logger.info("consignmentStatus called .......!!!");
		return CONSIGNMENT_STATUS;
	}

	@PostMapping(CONSIGNMENT_STATUS_URL)
	public String consignmentStatusAction(@ModelAttribute(CONSIGNMENT_STATUS) @Valid TrackOrder trackOrder,
			Model model,HttpServletRequest httpServletRequest) {
		OrderDetails details=new OrderDetails();
		logger.info("trackOrder ID "+trackOrder.getOrderId());
		Order order=packMoveAndGoService.getOrderDetail(trackOrder.getOrderId());
		if (order==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;

		}
		logger.info("order ::"+order.toString());
		details.setOrder_id(order.getOrder_id());
		if ( order.getStatus().equalsIgnoreCase("A") ) {
			logger.info(BOOKING_STATUS_ACTIVE);
			details.setStatus(BOOKING_IS_ACTIVE);

		} else if (order.getStatus().equalsIgnoreCase("D") ) {
			logger.info(BOOKING_STATUS_CANCEL);

			details.setStatus(BOOKING_IS_CANCELED);
		}else{
			logger.info(BOOKING_STATUS_UNKNOWN);

			details.setStatus(UNKNOWN);
		}
		CustomerRegister customerRegister=packMoveAndGoService.getCustomerDetailById(order.getCust_id());
		if (customerRegister==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		details.setCust_name(customerRegister.getCust_name());
		details.setCust_ph(customerRegister.getCust_ph());

		logger.info("customerRegister ::"+customerRegister.toString());

		Booking booking=packMoveAndGoService.getBookingDetailById(customerRegister.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		logger.info("booking ::"+booking.toString());
		details.setBooking_date(booking.getBooking_date());
		List<Branch> list= packMoveAndGoService.getBranchList();
		for (Branch branch : list) {
			if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {
				details.setSrc_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
				details.setDest_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==booking.getBranch_id()) {
				details.setBranch_name(branch.getBranch_name());
			}
		}
		if(details.getBranch_name().equalsIgnoreCase(details.getSrc_branch())) {

			details.setStatusOfConsignment(ORDER2);

		}else if(details.getBranch_name().equalsIgnoreCase(details.getDest_branch())) {

			details.setStatusOfConsignment(DELIVERED);

		}else {
			details.setStatusOfConsignment(TRANSIT);
		}


		BusinessPartner businessPartner=packMoveAndGoService.getBusinessPartnerDetailById(booking.getDest_agent_id());
		if (businessPartner==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		logger.info("businessPartner ::"+businessPartner.toString());
		details.setAgent_name(businessPartner.getAgent_name());
		
		model.addAttribute(DETAILS, details);

		logger.info("Order Detail "+order.toString());
		logger.info("consignmentStatus called .......!!!");
		return ORDERLIST;
	}


	@GetMapping(TRACK_ORDER_URL)
	public String trackOrder() {
		logger.info("trackOrder called .......!!!");
		return TRACK_ORDER;
	}
	@PostMapping(TRACK_ORDER_URL)
	public String trackOrder(@ModelAttribute(TRACK_ORDER) @Valid TrackOrder trackOrder,BindingResult result,
			Model model,HttpServletRequest httpServletRequest) {
		int searchOrderId=0;
		logger.info("1trackOrder==null trackOrder.getOrderId() "+trackOrder.getOrderId()+" trackOrder.getBookingId() "+trackOrder.getBookingId());

		if (trackOrder.getOrderId()<=0 && trackOrder.getBookingId()<=0) {
			logger.info("2trackOrder==null trackOrder.getOrderId() "+trackOrder.getOrderId()+" trackOrder.getBookingId() "+trackOrder.getBookingId());
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return TRACK_ORDER;

		}
		if (trackOrder.getOrderId() > 0) {

			searchOrderId=trackOrder.getOrderId();

		} else if (trackOrder.getBookingId() > 0) {

			searchOrderId=packMoveAndGoService.getOrderIdByBookingId(trackOrder.getBookingId());

		}else{
			searchOrderId=trackOrder.getOrderId();
		}
		OrderDetails details=new OrderDetails();
		logger.info("searchOrderId ID "+searchOrderId);
		Order order=packMoveAndGoService.getOrderDetail(searchOrderId);
		if (order==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return TRACK_ORDER;

		}
		logger.info("order ::"+order.toString());
		details.setOrder_id(order.getOrder_id());
		if ( order.getStatus().equalsIgnoreCase("A") ) {
			logger.info(BOOKING_STATUS_ACTIVE);
			details.setStatus(BOOKING_IS_ACTIVE);

		} else if (order.getStatus().equalsIgnoreCase("D") ) {
			logger.info(BOOKING_STATUS_CANCEL);

			details.setStatus(BOOKING_IS_CANCELED);
		}else{
			logger.info(BOOKING_STATUS_UNKNOWN);

			details.setStatus(UNKNOWN);
		}

		CustomerRegister customerRegister=packMoveAndGoService.getCustomerDetailById(order.getCust_id());
		if (customerRegister==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return TRACK_ORDER;
		}
		details.setCust_name(customerRegister.getCust_name());
		details.setCust_ph(customerRegister.getCust_ph());

		logger.info("customerRegister ::"+customerRegister.toString());

		Booking booking=packMoveAndGoService.getBookingDetailById(customerRegister.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return TRACK_ORDER;
		}
		logger.info("booking ::"+booking.toString());
		details.setBooking_date(booking.getBooking_date());
		List<Branch> list= packMoveAndGoService.getBranchList();
		for (Branch branch : list) {
			if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {
				details.setSrc_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
				details.setDest_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==booking.getBranch_id()) {
				details.setBranch_name(branch.getBranch_name());
			}

		}
		if(details.getBranch_name().equalsIgnoreCase(details.getSrc_branch())) {

			details.setStatusOfConsignment(ORDER2);

		}else if(details.getBranch_name().equalsIgnoreCase(details.getDest_branch())) {

			details.setStatusOfConsignment(DELIVERED);

		}else {
			details.setStatusOfConsignment(TRANSIT);
		}
		BusinessPartner businessPartner=packMoveAndGoService.getBusinessPartnerDetailById(booking.getDest_agent_id());
		if (businessPartner==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return TRACK_ORDER;
		}
		logger.info("businessPartner ::"+businessPartner.toString());
		details.setAgent_name(businessPartner.getAgent_name());
		model.addAttribute(DETAILS, details);
		logger.info("Order Detail "+order.toString());
		logger.info("trackOrderList called .......!!!");
		return TRACK_ORDER_LIST;
	}


	@GetMapping(WAY_BILL_URL)
	public String wayBill(@RequestParam (ORDER_ID) int order_id,Model model,HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse
			) throws FileNotFoundException {

		model.addAttribute(ORDER_ID, order_id);
		model.addAttribute(MESSAGE, "Way Bill Generation under process...........!!!!!!!!!");
		logger.info("Downloading A .PDF File From The Server ....!");

		String way_bill_pdfFilePath = PackeMoveAndGoUtils.getFilePath(httpServletRequest)
				+ File.separator + "way_bill_oder_id_"+order_id+".pdf"; 
		logger.info("Absolute Path Of The way_bill_pdfFilePath .PDF File Is?= " + way_bill_pdfFilePath);

		/**** Get The Absolute Path Of The File ****/
		logger.info("Absolute Path Of The .PDF File Is?= " + way_bill_pdfFilePath);

		File downloadFile = new File(way_bill_pdfFilePath);
		if(downloadFile.exists()) {
			PackeMoveAndGoUtils.downloadFileProperties(httpServletRequest, httpServletResponse, way_bill_pdfFilePath, downloadFile);				
		} else {
			logger.info("Requested .PDF File Not Found At The Server ....!");
			model.addAttribute(MESSAGE, "Requested .PDF File Not Found At The Server ....!");
		}
		return DOCUMENTATION;
	}

	@GetMapping(CONSIGNMENT_BILL_URL)
	public String consignmentBill(@RequestParam (ORDER_ID) int order_id,Model model,HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws FileNotFoundException {

		String consignment_bill_pdfFilePath = PackeMoveAndGoUtils.getFilePath(httpServletRequest)
				+ File.separator + "consignment_bill_oder_id_"+order_id+".pdf"; 


		logger.info("Absolute Path Of The consignment_bill_pdfFilePath .PDF File Is?= " + consignment_bill_pdfFilePath);
		File downloadFile = new File(consignment_bill_pdfFilePath);
		if(downloadFile.exists()) {
			PackeMoveAndGoUtils.downloadFileProperties(httpServletRequest, httpServletResponse, consignment_bill_pdfFilePath, downloadFile);				
		} else {
			logger.info("Requested .PDF File Not Found At The Server ....!");
			model.addAttribute(MESSAGE, "Requested .PDF File Not Found At The Server ....!");
		}
		return DOCUMENTATION;
	}

	@GetMapping(PAYMENT_RECEIPT_URL)
	public String paymentReceipt(@RequestParam (ORDER_ID) int order_id,Model model,
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) throws FileNotFoundException {

		String payment_receipt_pdfFilePath = PackeMoveAndGoUtils.getFilePath(httpServletRequest)
				+ File.separator + "payment_receipt_oder_id_"+order_id+".pdf"; 
		
		logger.info("Absolute Path Of The payment_receipt_pdfFilePath .PDF File Is?= " + payment_receipt_pdfFilePath);
		File downloadFile = new File(payment_receipt_pdfFilePath);
		if(downloadFile.exists()) {
			PackeMoveAndGoUtils.downloadFileProperties(httpServletRequest, httpServletResponse, payment_receipt_pdfFilePath, downloadFile);				
		} else {
			logger.info("Requested .PDF File Not Found At The Server ....!");
			model.addAttribute(MESSAGE, "Requested .PDF File Not Found At The Server ....!");
		}
		return DOCUMENTATION;
	}

	@GetMapping(VIEWORDER_URL)
	public String vieworder(@RequestParam (ORDER_ID) int order_id,Model model,HttpServletRequest httpServletRequest) {

		OrderDetails details=new OrderDetails();
		logger.info("vieworder called .......!!! order_id "+order_id);
		Order order=packMoveAndGoService.getOrderDetail(order_id);
		if (order==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		logger.info("order ::"+order.toString());
		details.setOrder_id(order.getOrder_id());

		CustomerRegister customerRegister=packMoveAndGoService.getCustomerDetailById(order.getCust_id());
		if (customerRegister==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		details.setCust_name(customerRegister.getCust_name());
		details.setCust_ph(customerRegister.getCust_ph());
		details.setCust_address(customerRegister.getCust_address());
		details.setCust_id(customerRegister.getCust_id());
		logger.info("customerRegister ::"+customerRegister.toString());

		Booking booking=packMoveAndGoService.getBookingDetailById(customerRegister.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		logger.info("booking ::"+booking.toString());
		details.setBooking_date(booking.getBooking_date());
		details.setBooking_id(booking.getBooking_id());
		List<Branch> list= packMoveAndGoService.getBranchList();
		for (Branch branch : list) {
			if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {

				logger.info("setSrc_branch .................");
				details.setSrc_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
				logger.info("setDest_branch .................");

				details.setDest_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==booking.getBranch_id()) {
				details.setBranch_name(branch.getBranch_name());
				logger.info("setBranch_name .................branch.getBranch_id() "+branch.getBranch_id());
			}
		}
		model.addAttribute(DETAILS, details);
		return VIEW_ORDER;
	}

	@PostMapping(UPDATE_CONSIGNMENT_STATUS_URL)
	public String updateConsignmentStatusAction(
			@ModelAttribute("updateConsignmentStatus") @Valid OrderDetails orderDetails,
			Model model,HttpServletRequest httpServletRequest) {

		logger.info("Order Id "+orderDetails.getOrder_id());
		logger.info("Branch Id "+orderDetails.getBranch_id());
		logger.info("Customer Id "+orderDetails.getCust_id());
		logger.info("booking_id Id "+orderDetails.getBooking_id());
		
		Booking booking=packMoveAndGoService.getBookingDetailById(orderDetails.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		booking.setBranch_id(orderDetails.getBranch_id());
		packMoveAndGoService.updateConsignmentStatus(booking);
		TrackOrder order=new TrackOrder();
		order.setOrderId(orderDetails.getOrder_id());
		return	consignmentStatusAction(order,model,httpServletRequest);
	}
	@GetMapping(ADVANCE_SEARCH_URL)
	public String advanceSearch() {
		logger.info("advanceSearch called .......!!!");
		return ADVANCE_SEARCH;
	}
	@PostMapping(ADVANCE_SEARCH_URL)
	public String advanceSearchAction(
			@ModelAttribute(TRACK_ORDER) @Valid TrackOrder trackOrder,BindingResult result, 
			Model model,HttpServletRequest httpServletRequest) {
		logger.info("advanceSearchAction called .......!!!");
		List<OrderDetails> orderDetailsList=new ArrayList<>();
		List<MyJoinTableData> myJoinTableDataList=null;

		int searchOrderId=0;
		logger.info("1trackOrder==null trackOrder.getOrderId() "+trackOrder.getOrderId()+" trackOrder.getBookingId() "+trackOrder.getBookingId());

		if (trackOrder.getOrderId()<=0 && trackOrder.getBookingId()<=0&&trackOrder.getCustomerName().isEmpty()) {
			logger.info("2trackOrder==null trackOrder.getOrderId() "+trackOrder.getOrderId()+" trackOrder.getBookingId() "+trackOrder.getBookingId());
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Input Value .........!!!!!!");
			return ADVANCE_SEARCH;

		}

		logger.info("1Customer "+trackOrder.getCustomerName());

		if (!trackOrder.getCustomerName().isEmpty()) {

			logger.info("2Customer "+trackOrder.getCustomerName());
			httpServletRequest.getSession().setAttribute("searchByAdvanceSearch", trackOrder.getCustomerName());

			myJoinTableDataList=packMoveAndGoService.getAllOrderDetailsByCustomerName(trackOrder.getCustomerName());	

			if (myJoinTableDataList.size()==0) {
				model.addAttribute(MESSAGE, "Opps! Please Enter Valid Input Record is not available.........!!!!!!");
				return ADVANCE_SEARCH;
			} else {
				CustomerRegister customerRegister=myJoinTableDataList.get(0).getCustomerRegister();
				logger.info("myJoinTableDataList Customer Name "+customerRegister.getCust_name());
				logger.info("myJoinTableDataList "+myJoinTableDataList.size());
				List<Branch> branchsList= packMoveAndGoService.getBranchList();
				String statusOfCon="";
				String status="";
				String src_branch = "";
				String dest_branch="";
				for (MyJoinTableData myJoinTableData : myJoinTableDataList) {


					if ( myJoinTableData.getOrder().getStatus().equalsIgnoreCase("A") ) {
						logger.info(BOOKING_STATUS_ACTIVE);
						status=BOOKING_IS_ACTIVE;

					} else if (myJoinTableData.getOrder().getStatus().equalsIgnoreCase("D") ) {
						logger.info(BOOKING_STATUS_CANCEL);

						status=BOOKING_IS_CANCELED;
					}else{
						logger.info(BOOKING_STATUS_UNKNOWN);

						status=UNKNOWN;
					}

					for (Branch branch : branchsList) {
						if(branch.getBranch_id()==Integer.parseInt(myJoinTableData.getBooking().getSrc_branch())) {
							src_branch=branch.getBranch_name();
						}
						if(branch.getBranch_id()==Integer.parseInt(myJoinTableData.getBooking().getDest_branch())) {
							dest_branch=branch.getBranch_name();
						}
					}

					if(myJoinTableData.getBranch().getBranch_name().equalsIgnoreCase(
							myJoinTableData.getBooking().getSrc_branch().
							equalsIgnoreCase(String.valueOf(myJoinTableData.getBranch().getBranch_id()))
							?myJoinTableData.getBranch().getBranch_name():""
							)) {
						statusOfCon=ORDER2;
					}else if(myJoinTableData.getBranch().getBranch_name().equalsIgnoreCase(
							myJoinTableData.getBooking().getDest_branch().
							equalsIgnoreCase(String.valueOf(myJoinTableData.getBranch().getBranch_id()))
							?myJoinTableData.getBranch().getBranch_name():""
							))
					{
						statusOfCon="Delivered";
					}else {
						statusOfCon=TRANSIT;
					}
					logger.info("getSrc_branch "+myJoinTableData.getBooking().getSrc_branch());
					logger.info("getDest_branch "+myJoinTableData.getBooking().getDest_branch());


					logger.info("src_branch "+src_branch);
					logger.info("dest_branch "+dest_branch);

					orderDetailsList.add(new OrderDetails(
							myJoinTableData.getCustomerRegister().getCust_name(),
							myJoinTableData.getCustomerRegister().getCust_ph(),
							myJoinTableData.getOrder().getOrder_id(),
							myJoinTableData.getBusinessPartner().getAgent_name(),
							myJoinTableData.getBranch().getBranch_name(),
							myJoinTableData.getBooking().getBooking_date(),
							src_branch,
							dest_branch	,
							statusOfCon,
							status));	
				}
				model.addAttribute(ORDER_DETAILS_LIST, orderDetailsList);
			}
			return ADVANCE_SEARCH_LIST;

		} else {
			if (trackOrder.getOrderId() > 0) {

				searchOrderId=trackOrder.getOrderId();

			} else if (trackOrder.getBookingId() > 0) {

				searchOrderId=packMoveAndGoService.getOrderIdByBookingId(trackOrder.getBookingId());
				logger.info("packMoveAndGoService.getOrderIdByBookingId "+searchOrderId);

			}else{
				searchOrderId=trackOrder.getOrderId();
				logger.info("trackOrder.getOrderId() "+searchOrderId);

			}
			logger.info("searchOrderId "+searchOrderId);

			orderDetailsList=getAllOrderDetailsByOrderId(searchOrderId);

			if (orderDetailsList.size()==0) {
				model.addAttribute(MESSAGE, "Opps! Please Enter Valid Input Record is not available.........!!!!!!");
				return ADVANCE_SEARCH;

			} else {

				OrderDetails orderDetails=null;
				for (OrderDetails details : orderDetailsList) {
					orderDetails=new OrderDetails(
							details.getCust_name(),
							details.getCust_ph(),
							details.getOrder_id(),
							details.getAgent_name(),
							details.getBranch_name(),
							details.getBooking_date(),
							details.getSrc_branch(),
							details.getDest_branch()	,
							details.getStatusOfConsignment(),
							details.getStatus());
				}
				model.addAttribute(DETAILS, orderDetails);
				logger.info("Order Detail "+orderDetails.toString());
				logger.info("consignmentStatus called .......!!!");
				return ORDERLIST;
			}
		}
	}

	@GetMapping(ADVANCE_SEARCH_VIEW_ORDER_URL)
	public String advanceSearchViewOrder(@RequestParam (ORDER_ID) int order_id,Model model,HttpServletRequest httpServletRequest) {

		OrderDetails details=new OrderDetails();
		logger.info("vieworder called .......!!! order_id "+order_id);
		Order order=packMoveAndGoService.getOrderDetail(order_id);
		if (order==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		logger.info("order ::"+order.toString());
		details.setOrder_id(order.getOrder_id());

		CustomerRegister customerRegister=packMoveAndGoService.getCustomerDetailById(order.getCust_id());
		if (customerRegister==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		details.setCust_name(customerRegister.getCust_name());
		details.setCust_ph(customerRegister.getCust_ph());
		details.setCust_address(customerRegister.getCust_address());
		details.setCust_id(customerRegister.getCust_id());
		logger.info("customerRegister ::"+customerRegister.toString());

		Booking booking=packMoveAndGoService.getBookingDetailById(customerRegister.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		logger.info("booking ::"+booking.toString());
		details.setBooking_date(booking.getBooking_date());
		details.setBooking_id(booking.getBooking_id());
		List<Branch> list= packMoveAndGoService.getBranchList();
		for (Branch branch : list) {
			if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {

				logger.info("setSrc_branch .................");
				details.setSrc_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
				logger.info("setDest_branch .................");

				details.setDest_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==booking.getBranch_id()) {
				details.setBranch_name(branch.getBranch_name());
				logger.info("setBranch_name .................branch.getBranch_id() "+branch.getBranch_id());
			}
		}
		model.addAttribute(DETAILS, details);
		return ADVANCE_SEARCH_VIEW_ORDER;
	}

	@PostMapping(ADVANCE_SEARCH_UPDATE_CONSIGNMENT_STATUS_URL)
	public String AdvanceSearchUpdateConsignmentStatus(
			@ModelAttribute("advanceSearchUpdateConsignmentStatus") @Valid OrderDetails orderDetails,BindingResult result,
			Model model,HttpServletRequest httpServletRequest) {

		logger.info("Order Id "+orderDetails.getOrder_id());
		logger.info("Branch Id "+orderDetails.getBranch_id());
		logger.info("Customer Id "+orderDetails.getCust_id());
		logger.info("booking_id Id "+orderDetails.getBooking_id());
		Booking booking=packMoveAndGoService.getBookingDetailById(orderDetails.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return CONSIGNMENT_STATUS;
		}
		booking.setBranch_id(orderDetails.getBranch_id());
		packMoveAndGoService.updateConsignmentStatus(booking);
		TrackOrder order=new TrackOrder();
		order.setOrderId(orderDetails.getOrder_id());
		TrackOrder trackOrder=new TrackOrder();
		String searchByAdvanceSearch=(String)httpServletRequest.getSession().getAttribute("searchByAdvanceSearch");
		logger.info("searchByAdvanceSearch "+searchByAdvanceSearch);
		trackOrder.setCustomerName(searchByAdvanceSearch);
		return	advanceSearchAction(trackOrder,result,model,httpServletRequest);
	}


	@GetMapping(CANCELORDER_URL)
	public String cancelOrder(@RequestParam (ORDER_ID) int order_id,Model model,HttpServletRequest httpServletRequest) {

		Order order =packMoveAndGoService.getOrderDetail(order_id);
		if (order==null) {
			model.addAttribute(MESSAGE, "Opps! Something went worng Order is not Cancel.........!!!!!!");
			return CONSIGNMENT_STATUS;

		}
		order.setStatus("D");
		packMoveAndGoService.updateOrderDetail(order);
		TrackOrder trackOrder=new TrackOrder();
		trackOrder.setOrderId(order_id);
		model.addAttribute("tableMessage", "Order is Canceled Order Id is "+order_id);
		return consignmentStatusAction(trackOrder,model,httpServletRequest);

	}
	@GetMapping(PROOF_OF_DELIVERY_SEARCH_URL)
	public String proofOfDeliverySearch() {
		logger.info("proofOfDeliverySearch called .......!!!");
		return PROOF_OF_DELIVERY_SEARCH;
	}
	@PostMapping(PROOF_OF_DELIVERY_SEARCH_URL)
	public String proofOfDeliverySearchAction(@ModelAttribute(PROOF_OF_DELIVERY_SEARCH) @Valid TrackOrder trackOrder,
			BindingResult result,
			Model model,HttpServletRequest httpServletRequest) {
		int searchOrderId=0;
		logger.info("1trackOrder==null trackOrder.getOrderId() "+trackOrder.getOrderId()+" trackOrder.getBookingId() "+trackOrder.getBookingId());

		if (trackOrder.getOrderId()<=0 && trackOrder.getBookingId()<=0) {
			logger.info("2trackOrder==null trackOrder.getOrderId() "+trackOrder.getOrderId()+" trackOrder.getBookingId() "+trackOrder.getBookingId());
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return PROOF_OF_DELIVERY_SEARCH;

		}
		if (trackOrder.getOrderId() > 0) {

			searchOrderId=trackOrder.getOrderId();

		} else if (trackOrder.getBookingId() > 0) {

			searchOrderId=packMoveAndGoService.getOrderIdByBookingId(trackOrder.getBookingId());

		}else{
			searchOrderId=trackOrder.getOrderId();
		}
		OrderDetails details=new OrderDetails();
		logger.info("searchOrderId ID "+searchOrderId);
		Order order=packMoveAndGoService.getOrderDetail(searchOrderId);
		if (order==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return PROOF_OF_DELIVERY_SEARCH;

		}
		logger.info("order ::"+order.toString());
		details.setOrder_id(order.getOrder_id());
		if ( order.getStatus().equalsIgnoreCase("A") ) {
			logger.info(BOOKING_STATUS_ACTIVE);
			details.setStatus(BOOKING_IS_ACTIVE);

		} else if (order.getStatus().equalsIgnoreCase("D") ) {
			logger.info(BOOKING_STATUS_CANCEL);

			details.setStatus(BOOKING_IS_CANCELED);
		}else{
			logger.info(BOOKING_STATUS_UNKNOWN);

			details.setStatus(UNKNOWN);
		}

		CustomerRegister customerRegister=packMoveAndGoService.getCustomerDetailById(order.getCust_id());
		if (customerRegister==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return PROOF_OF_DELIVERY_SEARCH;
		}
		details.setCust_name(customerRegister.getCust_name());
		details.setCust_ph(customerRegister.getCust_ph());

		logger.info("customerRegister ::"+customerRegister.toString());

		Booking booking=packMoveAndGoService.getBookingDetailById(customerRegister.getCust_id());
		if (booking==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return PROOF_OF_DELIVERY_SEARCH;
		}
		logger.info("booking ::"+booking.toString());
		details.setBooking_date(booking.getBooking_date());
		List<Branch> list= packMoveAndGoService.getBranchList();
		for (Branch branch : list) {
			if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {
				details.setSrc_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
				details.setDest_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==booking.getBranch_id()) {
				details.setBranch_name(branch.getBranch_name());
			}

		}
		if(details.getBranch_name().equalsIgnoreCase(details.getSrc_branch())) {

			details.setStatusOfConsignment(ORDER2);

		}else if(details.getBranch_name().equalsIgnoreCase(details.getDest_branch())) {

			details.setStatusOfConsignment(DELIVERED);

		}else {
			details.setStatusOfConsignment(TRANSIT);
		}
		BusinessPartner businessPartner=packMoveAndGoService.getBusinessPartnerDetailById(booking.getDest_agent_id());
		if (businessPartner==null) {
			model.addAttribute(MESSAGE, "Opps! Please Enter Valid Order Number Record is not available.........!!!!!!");
			return PROOF_OF_DELIVERY_SEARCH;
		}
		logger.info("businessPartner ::"+businessPartner.toString());
		details.setAgent_name(businessPartner.getAgent_name());
		
		// Creating the directory to store file
		String rootPath = System.getProperty(CATALINA_HOME);
		File dir = new File(rootPath + File.separator + TMP_FILES);
		if (!dir.exists())
			dir.mkdirs();

		// Create the file on server
		String path = dir.getAbsolutePath()+File.separator;
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
			  logger.info("Files list -  " + listOfFiles[i].getName());
			  if(listOfFiles[i].getName().contains(String.valueOf(details.getOrder_id()))){
				  logger.info("This file exists...");
					model.addAttribute("proofOfDelivery", "exists");
					String attributeValue = path+listOfFiles[i].getName();
					String url = "<a href=\"file:///"+attributeValue+"\">Download</a>";
					model.addAttribute("proofOfDeliveryPath", url);
					break;
			  }
		  } else if (listOfFiles[i].isDirectory()) {
			  logger.info("Directory " + listOfFiles[i].getName());
		  }
		}
		
		model.addAttribute(DETAILS, details);
		logger.info("Order Detail "+order.toString());
		logger.info("trackOrderList called .......!!!");
		return PROOF_OF_DELIVERY_LIST;
	}
	

	@GetMapping(PROOF_OF_DELIVERY_URL)
	public String proofOfdelivery(@RequestParam (ORDER_ID) int order_id,Model model,HttpServletRequest httpServletRequest) {
		logger.info("proofOfDelivery called .......!!!");getClass();
		if (order_id<=0) {
			return PROOF_OF_DELIVERY_SEARCH;
		} else if (order_id>0){
			model.addAttribute(ORDER_ID, order_id);
			return "proofOfDelivery";
		}else {
			return PROOF_OF_DELIVERY_SEARCH;
		}
	}
	/**
	 * Upload single file using Spring Controller
	 */
	@PostMapping(PROOF_OF_DELIVERY_URL)
	public String proofOfdeliveryAction(@RequestParam(ORDER_ID) String order_id,Model model,
			@RequestParam("proofOfDeliveryFile") MultipartFile file,
			HttpServletRequest httpServletRequest) {
		String name=file.getOriginalFilename()+" and Order Number "+order_id;
		TrackOrder trackOrder=new TrackOrder();
		trackOrder.setOrderId(Integer.parseInt(order_id));
		BindingResult result = null;
		logger.info("proofOfdeliveryAction Calling ....."+name );
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty(CATALINA_HOME);
				File dir = new File(rootPath + File.separator + TMP_FILES);
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath() + File.separator +name  );
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				logger.info("Server File Location="+ serverFile.getAbsolutePath());
				model.addAttribute("fileUploadMessage", "You successfully uploaded file=" + name);
				return proofOfDeliverySearchAction(trackOrder,result,model, httpServletRequest);
			} catch (Exception e) {
				model.addAttribute("fileUploadMessage", "You failed to upload " + name + " => " + e.getMessage());
				return proofOfDeliverySearchAction(trackOrder,result,model, httpServletRequest);
			}
		} else {
			model.addAttribute("fileUploadMessage", "You failed to upload " + name + " because the file was empty.");
			return proofOfDeliverySearchAction(trackOrder,result,model, httpServletRequest);
		}
	}

	/**
	 * Upload multiple file using Spring Controller
	 */
	@RequestMapping(value = UPLOAD_MULTIPLE_FILE_URL, method = RequestMethod.POST)
	public @ResponseBody
	String uploadMultipleFileHandler(@RequestParam("name") String[] names, @RequestParam("file") MultipartFile[] files) {

		if (files.length != names.length)
			return "Mandatory information missing";

		String message = "";
		for (int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			String name = names[i];
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty(CATALINA_HOME);
				File dir = new File(rootPath + File.separator + TMP_FILES);
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				logger.info("Server File Location="+ serverFile.getAbsolutePath());
				message = message + "You successfully uploaded file=" + name + "<br />";
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		}
		return message;
	}

	@GetMapping(SEND_ENQUIRY_URL)
	public String sendEnquiry() {
		logger.info("services called .......!!!");
		return SERVICES;
	}
	@PostMapping(SEND_ENQUIRY_URL)
	public String sendEnquiryAction(
			@ModelAttribute("sendEnquiry") @Valid SendEnquiry sendEnquiry,BindingResult result,
			Model model,HttpServletRequest httpServletRequest) {

		long id = packMoveAndGoService.saveSendEnquiry(sendEnquiry);

		if (id>0) {
			logger.info("saveSendEnquiry Id "+id);
			model.addAttribute(MESSAGE, "Your Ticket Generated,We will contact as soon as possible "
					+ "Your Ticket Number is "+id);
			return INDEX;
		}else {
			model.addAttribute(MESSAGE, "Opps! Some thing went worng .........!!!!!!");
			return INDEX;
		}
	}
	@GetMapping(MIS_REPORT_URL)
	public String misReport() {
		logger.info("misReport called .......!!!");
		return MIS_REPORT;
	}

	@PostMapping(MIS_REPORT_URL)
	public void misReportAction(@ModelAttribute(MIS_REPORT) @Valid MISReport misReport,BindingResult result,
			@RequestParam("misReportRadioButton") String misReportRadioButton,
			Model model,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws FileNotFoundException {
		logger.info("misReport called .......!!! "+misReportRadioButton);
		logger.info("misReport called .......getDatewise !!! "+misReport.getDatewise());
		logger.info("misReport called .......getStartDate !!! "+misReport.getStartDate());
		logger.info("misReport called .......getEndDate !!! "+misReport.getEndDate());
		logger.info("misReport called .......getMonthlyDate !!! "+misReport.getMonthlyDate());
		List<MyJoinTableData> myJoinTableDataList=null;
		String pdfFilePath = "", pdfFileName = "";
		if (misReportRadioButton.equalsIgnoreCase("Monthly")) {
			pdfFileName="Monthly_"+misReport.getMonthlyDate()+"_mis_report.pdf";
			logger.info("Monthly Operation.........!!!!!!!pdfFileName "+pdfFileName);
			 myJoinTableDataList=packMoveAndGoService.getAllDetailByMonthlyDate(misReport.getMonthlyDate());	
		} else if (misReportRadioButton.equalsIgnoreCase("Yearly")) {
			pdfFileName="Yearly_From_"+misReport.getStartDate()+"_To"+misReport.getEndDate()+"_mis_report.pdf";
			logger.info("Yearly Operation.........!!!!!!!pdfFileName "+pdfFileName);
			myJoinTableDataList=packMoveAndGoService.getAllDetailByYearlyDate(misReport.getStartDate(),misReport.getEndDate());
		} else if (misReportRadioButton.equalsIgnoreCase("DateWise")) {
			logger.info("DateWise Operation.........!!!!!!!");
			pdfFileName="DateWise_"+misReport.getDatewise()+"_mis_report.pdf";
			logger.info("DateWise Operation.........!!!!!!!pdfFileName "+pdfFileName);
			myJoinTableDataList=packMoveAndGoService.getAllDetailByDatewiseDate(misReport.getDatewise());
		} else {
			logger.info("Else Operation.........!!!!!!!");
		}

		PrintReport printReport=new PrintReport(); 
		String toLocation=PackeMoveAndGoUtils.getFilePath(httpServletRequest) + File.separator;
		printReport.createPDF(pdfFileName,toLocation,myJoinTableDataList );
		logger.info("Downloading A .PDF File From The Server ....!");

		/**** Get The Absolute Path Of The File ****/
		pdfFilePath = toLocation+pdfFileName;      
		logger.info("Absolute Path Of The .PDF File Is?= " + pdfFilePath);
		File downloadFile = new File(pdfFilePath);
		if(downloadFile.exists()) {
			PackeMoveAndGoUtils.downloadFileProperties(httpServletRequest, httpServletResponse, pdfFilePath, downloadFile);				
		} else {
			logger.info("Requested .PDF File Not Found At The Server ....!");
		}
	}

	@GetMapping("/enquiryDetails")
	public String enquiryDetailsAction(
			@ModelAttribute("sendEnquiry") @Valid SendEnquiry sendEnquiry,BindingResult result,
			Model model,HttpServletRequest httpServletRequest){
		logger.info("enquiryDetailsAction .......!!! "+sendEnquiry);

		List<SendEnquiry> allEnquiries = packMoveAndGoService.getAllEnquiries();
		logger.info("allEnquiries .......!!! "+allEnquiries);
		model.addAttribute("allEnquiries", allEnquiries);
		
		return "enquiryList";
	}
	
	private List<OrderDetails>  getAllOrderDetailsByOrderId(int searchOrderId) {

		List<OrderDetails> orderDetailsList=new ArrayList<>();

		OrderDetails details=new OrderDetails();
		logger.info("searchOrderId ID "+searchOrderId);
		Order order=packMoveAndGoService.getOrderDetail(searchOrderId);
		if (order==null) {
			return orderDetailsList;
		}
		logger.info("order ::"+order.toString());
		details.setOrder_id(order.getOrder_id());

		CustomerRegister customerRegister=packMoveAndGoService.getCustomerDetailById(order.getCust_id());
		if (customerRegister==null) {
			return orderDetailsList;
		}
		details.setCust_name(customerRegister.getCust_name());
		details.setCust_ph(customerRegister.getCust_ph());

		logger.info("customerRegister ::"+customerRegister.toString());

		Booking booking=packMoveAndGoService.getBookingDetailById(customerRegister.getCust_id());
		if (booking==null) {
			return orderDetailsList;
		}
		logger.info("booking ::"+booking.toString());
		details.setBooking_date(booking.getBooking_date());
		List<Branch> list= packMoveAndGoService.getBranchList();
		for (Branch branch : list) {
			if(branch.getBranch_id()==Integer.parseInt(booking.getSrc_branch())) {
				details.setSrc_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==Integer.parseInt(booking.getDest_branch())) {
				details.setDest_branch(branch.getBranch_name());
			}
			if(branch.getBranch_id()==booking.getBranch_id()) {
				details.setBranch_name(branch.getBranch_name());
			}
		}
		if(details.getBranch_name().equalsIgnoreCase(details.getSrc_branch())) {
			details.setStatusOfConsignment(ORDER2);
		}else if(details.getBranch_name().equalsIgnoreCase(details.getDest_branch())) {
			details.setStatusOfConsignment(DELIVERED);
		}else {
			details.setStatusOfConsignment(TRANSIT);
		}
		BusinessPartner businessPartner=packMoveAndGoService.getBusinessPartnerDetailById(booking.getDest_agent_id());
		if (businessPartner==null) {
			return orderDetailsList;
		}
		logger.info("businessPartner ::"+businessPartner.toString());
		details.setAgent_name(businessPartner.getAgent_name());
		logger.info("Order Detail "+order.toString());
		logger.info("trackOrderList called .......!!!");
		orderDetailsList.add(details);
		return orderDetailsList;
	}

	@GetMapping(LOGOUT_URL)
	public String logout(HttpServletRequest request) {
		logger.info("logout called .......!!!");
		logger.info("logout()");
		HttpSession httpSession = request.getSession();
		httpSession.invalidate();
		return INDEX;
	}


	@GetMapping(SERVICES_URL)
	public String services() {
		logger.info("services called .......!!!");
		return SERVICES;
	}

	@GetMapping(DOCUMENTATION_URL)
	public String documentation() {
		logger.info("documentation called .......!!!");
		return DOCUMENTATION;
	}
	@GetMapping(BALANCE_URL)
	public String balance() {
		logger.info("balance called .......!!!");
		return BALANCE;
	}

	@GetMapping(CAR_CARRIER_SERVICES_URL)
	public String carCarrierServices() {
		logger.info("car-carrier-services called .......!!!");
		return CAR_CARRIER_SERVICES;
	}
	@GetMapping(LOADING_AND_UNLOADING_SERVICES_URL)
	public String loadingAndUnloadingServices() {
		logger.info("loading-and-unloading-services called .......!!!");
		return LOADING_AND_UNLOADING_SERVICES;
	}
	@GetMapping(OFFICE_AND_LOCAL_SHIFTING_SERVICES_URL)
	public String officeAndLocalShiftingServices() {
		logger.info("loading-and-unloading-services called .......!!!");
		return OFFICE_AND_LOCAL_SHIFTING_SERVICES;
	}
	@GetMapping(PACKING_AND_MOVING_SERVICES_URL)
	public String packingAndMovingServices() {
		logger.info("packing-and-moving-services called .......!!!");
		return PACKING_AND_MOVING_SERVICES;
	}
	@GetMapping(TRANSPORTATION_SERVICES_URL)
	public String transportationServices() {
		logger.info("transportation-services called .......!!!");
		return TRANSPORTATION_SERVICES;
	}
	@GetMapping(WAREHOUSING_SERVICES_URL)
	public String warehousingServices() {
		logger.info("packing-and-moving-services called .......!!!");
		return WAREHOUSING_SERVICES;
	}
	@GetMapping(INSURANCE_SERVICES_URL)
	public String insuranceServices() {
		logger.info("insurance-services called .......!!!");
		return INSURANCE_SERVICES;
	}
	@GetMapping(CONTACT_US_URL)
	public String contactUs() {
		logger.info("contactus called .......!!!");
		return CONTACT_US;
	}

	@GetMapping(DATABASE_BACKUP_URL)
	public String databaseBackup() {
		logger.info("databaseBackup called .......!!!");
		return DATABASE_BACKUP;
	}

	@GetMapping(CLIENTS_URL)
	public String clients() {
		logger.info("clients called .......!!!");
		return CLIENTS;
	}

	@GetMapping(ABOUT_US_URL)
	public String aboutUs() {
		logger.info("aboutus called .......!!!");
		return ABOUT_US;
	}

	@GetMapping(PROCESS_URL)
	public String process() {
		logger.info("process called .......!!!");
		return PROCESS;
	}

	@GetMapping(NETWORK_URL)
	public String network() {
		logger.info("network called .......!!!");
		return NETWORK;
	}
	
	//payOnline
	@GetMapping("/payOnline")
	public String payOnline(Model model,HttpServletRequest httpServletRequest) {
		logger.info("payOnline called .......!!!");
		String cust_name=httpServletRequest.getParameter("cust_name"); 
		model.addAttribute("cust_name", cust_name);
		String qty=httpServletRequest.getParameter("qty"); 
		model.addAttribute("qty",qty); 
		logger.info("payOnline exit .......!!!"+cust_name);
		return "payOnline";
	}
	
	//payOnlineDone.jsp
	@PostMapping("/payOnlineDone")
	public String payOnlineDone(Model model,HttpServletRequest httpServletRequest) {
		logger.info("payOnline Done .......!!!");
		String cust_name=httpServletRequest.getParameter("cust_name"); 
		model.addAttribute("cust_name", cust_name);
		String amount=httpServletRequest.getParameter("amount"); 
		model.addAttribute("amount",amount); 
		logger.info("payOnlineDone exit .......!!!"+cust_name);
		return "payOnlineDone";
	}
	
	//payOnlineDone.jsp
	@GetMapping("/paymentRecvd")
	public String paymentRecvd(Model model,HttpServletRequest httpServletRequest) {
		logger.info("paymentRecvd Done .......!!!");
		String cust_name=httpServletRequest.getParameter("cust_name"); 
		model.addAttribute("cust_name", cust_name);
		String amount=httpServletRequest.getParameter("qty"); 
		int val = Integer.parseInt(amount);
		val = val * 100;
		String str = String.valueOf(val);
		model.addAttribute("amount",str); 
		logger.info("payOnlineDone exit .......!!!"+cust_name);
		return "paymentRecvd";
	}
}
