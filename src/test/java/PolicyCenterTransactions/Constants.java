package PolicyCenterTransactions;

public class Constants {

	// For Class CreateAccount
	public static final String url = ("http://localhost:8180/pc/PolicyCenter.do");
	public static final String userName = ("Login-LoginScreen-LoginDV-username");
	public static final String password = ("Login-LoginScreen-LoginDV-password");
	public static final String actionsMenu = ("Desktop-DesktopMenuActions");
	public static final String clickonActions = ("/html/body/form/div/div[2]/div[1]/div[1]/div");
	public static final String clickOnNewAccount = ("/html/body/form/div/div[2]/div[1]/div[1]/div/div[3]/div[3]/div/div[2]");
	public static final String fristName = ("NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-FirstName");
	public static final String lastName = ("NewAccount-NewAccountScreen-NewAccountSearchDV-GlobalPersonNameInputSet-LastName");
	public static final String searchForaccount = ("NewAccount-NewAccountScreen-NewAccountSearchDV-SearchAndResetInputSet-SearchLinksInputSet-Search");
	public static final String createNewAccount = ("gw-label");
	public static final String clickonNewAccounts = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[1]/div[2]");
	public static final String createPersonAccount = ("gw-label");
	public static final String clickonPerson = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div/div[3]/div[2]/div");
	public static final String addressLine = ("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-AddressLine1");
	public static final String state = ("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressInputSet-globalAddressContainer-GlobalAddressInputSet-State");
	public static final String clickonState = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[36]/div[2]/div/div/div/select");
	public static final String arizonaState = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[36]/div[2]/div/div/div/select/option[4]");
	public static final String addressType = ("CreateAccount-CreateAccountScreen-CreateAccountDV-AddressType");
	public static final String clickOnaddressType = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[38]/div[2]/div/div/div/select");
	public static final String homeAdressType = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[38]/div[2]/div/div/div/select/option[3]");
	public static final String producerCode = ("CreateAccount-CreateAccountScreen-CreateAccountDV-ProducerSelectionInputSet-Producer");
	public static final String searchOragnization = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[48]/div[2]/div/div[2]/div/span");
	public static final String searchWithA = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div/div/input");
	public static final String clickOnAcvriskButton = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[3]/div[2]/div/div[2]/table/tbody/tr[2]/td[1]/div/div");
	public static final String update = ("/html/body/form/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div");

	// For Class SearchForAccount

	public static final String accountTabBar = ("TabBar-AccountTab");
	public static final String clickOnTabBar = ("/html/body/form/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/div[3]/div");
	public static final String accountTabSearch = ("TabBar-AccountTab-AccountTab_AccountNumberSearchItem");
	public static final String clickOnNewSubbmission = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[6]/div[1]/div[4]/div[1]/div[2]/div/div/div[2]");
	public static final String effectiveDate = ("NewSubmission-NewSubmissionScreen-ProductSettingsDV-DefaultPPEffDate_dateIcon");
	public static final String pickYear = ("//*[@id=\"gw-datePicker--year--select\"]");
	public static final String pickMonth = ("//*[@id=\"gw-datePicker--month--select\"]");
	public static final String pickDate = ("//table[@class='gw-datePicker--calendar gw-inDatePicker']//td");
	public static final String selectProduct = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/table/tbody/tr[2]/td/div/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[10]/td[1]/div/div/div");
	public static final String offeringScreen = ("\"/html/body/form/div/div[2]/div[2]/div[2]/div/div[6]/div/div/div/div[2]/div/div/div/select\"");
	public static final String basicProgram = ("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[2]/div/div[2]");
	public static final String qualification = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[6]/div/div/div[3]/div[2]/div/div/div[2]/table/tbody/tr[1]/td[2]/div/div/div/div/select/option[2]");
	public static final String qoalificationToYes = ("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div");
	public static final String dateQuoteNeeded = ("SubmissionWizard-LOBWizardStepGroup-SubmissionWizard_PolicyInfoScreen-SubmissionWizard_PolicyInfoDV-DateQuoteNeeded_dateIcon");
	public static final String selectTerm = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[6]/div/div[3]/div[2]/div[2]/div/div/div/select/option[1]");
	public static final String clickOnAnnual = ("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[3]/div/div[2]");
	public static final String addDriver = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriversLV_tb-AddDriver");
	public static final String clickOnDriver = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div");
	public static final String driverFristName = ("NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-FirstName");
	public static final String driverLastName = ("NewPolicyDriverPopup-ContactDetailScreen-NewPolicyContactRoleDetailsCV-PolicyContactDetailsDV-PolicyContactRoleNameInputSet-GlobalPersonNameInputSet-LastName");
	public static final String driverDateOfBirth = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[9]/div[2]/div/div/input");
	public static final String addingExistDriver = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[32]/div[2]/div/div[2]/div/div[2]");
	public static final String clickOnAddExistDriver = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[32]/div[2]/div/div[2]/div/div[3]/div/div[1]");
	public static final String performOnExistDriver = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[32]/div[2]/div/div[2]/div/div[3]/div/div[4]/div/div");
	public static final String licenseNumber = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[45]/div[2]/div/div/input");
	public static final String licenseState = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[46]/div[2]/div/div/div/select");
	public static final String okToNewDriverScreen = ("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]/div/div[2]");
	public static final String clickOnRolesTab = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[1]/div[2]/div");
	public static final String yearlicensed = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PADriversScreen-PADriversPanelSet-DriversListDetailPanel-DriverDetailsCV-0-PolicyContactRolePanelSet-PolicyDriverInfoDV-yearlicensed");
	public static final String accidentsToZero = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/div/div/select");
	public static final String accidentToZero = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td/div/div/div[2]/table/tbody/tr[2]/td[3]/div/div/div/div/select");
	public static final String violationsToZero = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td/div/div/div[2]/table/tbody/tr[3]/td[2]/div/div/div/div/select");
	public static final String violationToZero = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div/div[2]/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td/div/div/div[2]/table/tbody/tr[3]/td[3]/div/div/div/div/select");
	public static final String submissionWizardNext = ("SubmissionWizard-Next");
	public static final String addVechile = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel_tb-Add");
	public static final String addVechileVIN = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-Vin_DV");
	public static final String vehicleLicenseState = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-LicenseState_DV");
	public static final String clickOnArizonastate = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[11]/div[2]/div/div/div/select/option[4]");
	public static final String coStOFVechile = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-CostNew_DV");
	public static final String assingDriverToVechile = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PAVehiclesScreen-PAVehiclesPanelSet-VehiclesListDetailPanel-VehiclesDetailsCV-PersonalAuto_VehicleDV-PersonalAuto_AssignDriversInputSet-DriverPctLV_tb-AddDriver");
	public static final String clickOnAssingDriverToVechile = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[5]/table/tbody/tr/td/div[3]/div[2]/div[2]/div/div/div/div/div[1]/div[17]/div[2]/div/div/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]");
	public static final String checkBoxTheCoverage = ("SubmissionWizard-LOBWizardStepGroup-LineWizardStepSet-PersonalAutoScreen-PAPerVehiclePanelSet-VehicleCoverageDetailsCV-PersonalAuto_VehicleCoverageDetailDV-0-CoverageInputSet-CovPatternInputGroup-_checkbox");
	public static final String rislAnalysis = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[7]/div[1]/div[1]/div");
	public static final String quoteScreen = ("SubmissionWizard-SubmissionWizard_PolicyReviewScreen-JobWizardToolbarButtonSet-QuoteTypeToolbarButtonSet-Quote");
	public static final String bindOptions = ("SubmissionWizard-SubmissionWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions");
	public static final String issueOption = ("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[8]/div[3]/div[2]/div/div[2]");
	public static final String viewPolicy = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[4]/div/div/div[4]/div[2]/div/div/div/div[2]");

	// For Class Search For policy
	public static final String policyTab = ("TabBar-PolicyTab");
	public static final String policySearchTab = ("/html/body/form/div/div[1]/div/div[2]/div[2]/div[1]/div[3]/div[3]/div");
	public static final String enterPolicyNumber = ("TabBar-PolicyTab-PolicyTab_PolicyRetrievalItem");

	// For Class Changepolicy
	public static final String newTransaction = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div");
	public static final String changePolicy = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[3]/div[1]/div/div[2]");
	public static final String policychangeEffDate = ("StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-EffectiveDate_dateIcon");
	public static final String policyChangeDescription = ("StartPolicyChange-StartPolicyChangeScreen-StartPolicyChangeDV-Description");
	public static final String tartPolicyChangeNext = ("StartPolicyChange-StartPolicyChangeScreen-NewPolicyChange");
	public static final String pCOfferingScreenToBasic = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[6]/div/div/div/div[2]/div/div/div/select/option[2]");
	public static final String policyChangeWizardNext = ("PolicyChangeWizard-Next");

	// For cancellations policy
	public static final String newTranaction = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[1]/div");
	public static final String cancelPolicy = ("/html/body/form/div/div[2]/div[2]/div[2]/div/div[10]/div[1]/div[1]/div[1]/div[2]/div/div[3]/div[2]/div/div[2]");
	public static final String source = ("StartCancellation-StartCancellationScreen-CancelPolicyDV-Source");
	public static final String reasonDescription = ("StartCancellation-StartCancellationScreen-CancelPolicyDV-ReasonDescription");
	public static final String reason = ("StartCancellation-StartCancellationScreen-CancelPolicyDV-Reason");
	public static final String cancelDatedateIcon = ("StartCancellation-StartCancellationScreen-CancelPolicyDV-CancelDate_dateIcon");
	public static final String startCancellation = ("StartCancellation-StartCancellationScreen-NewCancellation");
	public static final String cancellationWizardBindoptions = ("CancellationWizard-CancellationWizard_QuoteScreen-JobWizardToolbarButtonSet-BindOptions");
	public static final String cancelNow = ("/html/body/form/div/div[2]/div[2]/div[1]/div[3]/div[2]/div[5]/div[3]/div[2]/div/div[2]");

}
