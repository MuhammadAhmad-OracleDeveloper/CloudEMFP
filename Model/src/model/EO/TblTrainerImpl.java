package model.EO;

import oracle.jbo.domain.Number;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 31 12:15:51 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblTrainerImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        TrainerId,
        Name,
        FatherName,
        Ast,
        MarStatus,
        Gender,
        Dob,
        Doj,
        Ntn,
        PassNo,
        Cnic,
        DrLicNo,
        Telephone,
        Mobile,
        Email,
        Url,
        PreAddress,
        PerAddress,
        TrainerType,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblClusterAttMaster,
        TblGrantAppMaster,
        TblTeamFormation,
        TblTrainerAca,
        TblTrainerPerc;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int TRAINERID = AttributesEnum.TrainerId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int FATHERNAME = AttributesEnum.FatherName.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int MARSTATUS = AttributesEnum.MarStatus.index();
    public static final int GENDER = AttributesEnum.Gender.index();
    public static final int DOB = AttributesEnum.Dob.index();
    public static final int DOJ = AttributesEnum.Doj.index();
    public static final int NTN = AttributesEnum.Ntn.index();
    public static final int PASSNO = AttributesEnum.PassNo.index();
    public static final int CNIC = AttributesEnum.Cnic.index();
    public static final int DRLICNO = AttributesEnum.DrLicNo.index();
    public static final int TELEPHONE = AttributesEnum.Telephone.index();
    public static final int MOBILE = AttributesEnum.Mobile.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int URL = AttributesEnum.Url.index();
    public static final int PREADDRESS = AttributesEnum.PreAddress.index();
    public static final int PERADDRESS = AttributesEnum.PerAddress.index();
    public static final int TRAINERTYPE = AttributesEnum.TrainerType.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLCLUSTERATTMASTER = AttributesEnum.TblClusterAttMaster.index();
    public static final int TBLGRANTAPPMASTER = AttributesEnum.TblGrantAppMaster.index();
    public static final int TBLTEAMFORMATION = AttributesEnum.TblTeamFormation.index();
    public static final int TBLTRAINERACA = AttributesEnum.TblTrainerAca.index();
    public static final int TBLTRAINERPERC = AttributesEnum.TblTrainerPerc.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblTrainerImpl() {
    }

    /**
     * Gets the attribute value for TrainerId, using the alias name TrainerId.
     * @return the value of TrainerId
     */
    public Number getTrainerId() {
        return (Number) getAttributeInternal(TRAINERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainerId.
     * @param value value to set the TrainerId
     */
    public void setTrainerId(Number value) {
        setAttributeInternal(TRAINERID, value);
    }

    /**
     * Gets the attribute value for Name, using the alias name Name.
     * @return the value of Name
     */
    public String getName() {
        return (String) getAttributeInternal(NAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for Name.
     * @param value value to set the Name
     */
    public void setName(String value) {
        setAttributeInternal(NAME, value);
    }

    /**
     * Gets the attribute value for FatherName, using the alias name FatherName.
     * @return the value of FatherName
     */
    public String getFatherName() {
        return (String) getAttributeInternal(FATHERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FatherName.
     * @param value value to set the FatherName
     */
    public void setFatherName(String value) {
        setAttributeInternal(FATHERNAME, value);
    }

    /**
     * Gets the attribute value for Ast, using the alias name Ast.
     * @return the value of Ast
     */
    public String getAst() {
        return (String) getAttributeInternal(AST);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ast.
     * @param value value to set the Ast
     */
    public void setAst(String value) {
        setAttributeInternal(AST, value);
    }

    /**
     * Gets the attribute value for MarStatus, using the alias name MarStatus.
     * @return the value of MarStatus
     */
    public String getMarStatus() {
        return (String) getAttributeInternal(MARSTATUS);
    }

    /**
     * Sets <code>value</code> as the attribute value for MarStatus.
     * @param value value to set the MarStatus
     */
    public void setMarStatus(String value) {
        setAttributeInternal(MARSTATUS, value);
    }

    /**
     * Gets the attribute value for Gender, using the alias name Gender.
     * @return the value of Gender
     */
    public String getGender() {
        return (String) getAttributeInternal(GENDER);
    }

    /**
     * Sets <code>value</code> as the attribute value for Gender.
     * @param value value to set the Gender
     */
    public void setGender(String value) {
        setAttributeInternal(GENDER, value);
    }

    /**
     * Gets the attribute value for Dob, using the alias name Dob.
     * @return the value of Dob
     */
    public Timestamp getDob() {
        return (Timestamp) getAttributeInternal(DOB);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dob.
     * @param value value to set the Dob
     */
    public void setDob(Timestamp value) {
        setAttributeInternal(DOB, value);
    }

    /**
     * Gets the attribute value for Doj, using the alias name Doj.
     * @return the value of Doj
     */
    public Timestamp getDoj() {
        return (Timestamp) getAttributeInternal(DOJ);
    }

    /**
     * Sets <code>value</code> as the attribute value for Doj.
     * @param value value to set the Doj
     */
    public void setDoj(Timestamp value) {
        setAttributeInternal(DOJ, value);
    }

    /**
     * Gets the attribute value for Ntn, using the alias name Ntn.
     * @return the value of Ntn
     */
    public String getNtn() {
        return (String) getAttributeInternal(NTN);
    }

    /**
     * Sets <code>value</code> as the attribute value for Ntn.
     * @param value value to set the Ntn
     */
    public void setNtn(String value) {
        setAttributeInternal(NTN, value);
    }

    /**
     * Gets the attribute value for PassNo, using the alias name PassNo.
     * @return the value of PassNo
     */
    public String getPassNo() {
        return (String) getAttributeInternal(PASSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PassNo.
     * @param value value to set the PassNo
     */
    public void setPassNo(String value) {
        setAttributeInternal(PASSNO, value);
    }

    /**
     * Gets the attribute value for Cnic, using the alias name Cnic.
     * @return the value of Cnic
     */
    public String getCnic() {
        return (String) getAttributeInternal(CNIC);
    }

    /**
     * Sets <code>value</code> as the attribute value for Cnic.
     * @param value value to set the Cnic
     */
    public void setCnic(String value) {
        setAttributeInternal(CNIC, value);
    }

    /**
     * Gets the attribute value for DrLicNo, using the alias name DrLicNo.
     * @return the value of DrLicNo
     */
    public String getDrLicNo() {
        return (String) getAttributeInternal(DRLICNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DrLicNo.
     * @param value value to set the DrLicNo
     */
    public void setDrLicNo(String value) {
        setAttributeInternal(DRLICNO, value);
    }

    /**
     * Gets the attribute value for Telephone, using the alias name Telephone.
     * @return the value of Telephone
     */
    public String getTelephone() {
        return (String) getAttributeInternal(TELEPHONE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Telephone.
     * @param value value to set the Telephone
     */
    public void setTelephone(String value) {
        setAttributeInternal(TELEPHONE, value);
    }

    /**
     * Gets the attribute value for Mobile, using the alias name Mobile.
     * @return the value of Mobile
     */
    public String getMobile() {
        return (String) getAttributeInternal(MOBILE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Mobile.
     * @param value value to set the Mobile
     */
    public void setMobile(String value) {
        setAttributeInternal(MOBILE, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for Url, using the alias name Url.
     * @return the value of Url
     */
    public String getUrl() {
        return (String) getAttributeInternal(URL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Url.
     * @param value value to set the Url
     */
    public void setUrl(String value) {
        setAttributeInternal(URL, value);
    }

    /**
     * Gets the attribute value for PreAddress, using the alias name PreAddress.
     * @return the value of PreAddress
     */
    public String getPreAddress() {
        return (String) getAttributeInternal(PREADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PreAddress.
     * @param value value to set the PreAddress
     */
    public void setPreAddress(String value) {
        setAttributeInternal(PREADDRESS, value);
    }

    /**
     * Gets the attribute value for PerAddress, using the alias name PerAddress.
     * @return the value of PerAddress
     */
    public String getPerAddress() {
        return (String) getAttributeInternal(PERADDRESS);
    }

    /**
     * Sets <code>value</code> as the attribute value for PerAddress.
     * @param value value to set the PerAddress
     */
    public void setPerAddress(String value) {
        setAttributeInternal(PERADDRESS, value);
    }

    /**
     * Gets the attribute value for TrainerType, using the alias name TrainerType.
     * @return the value of TrainerType
     */
    public String getTrainerType() {
        return (String) getAttributeInternal(TRAINERTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for TrainerType.
     * @param value value to set the TrainerType
     */
    public void setTrainerType(String value) {
        setAttributeInternal(TRAINERTYPE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Number getCreatedBy() {
        return (Number) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Number value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public Number getUpdatedBy() {
        return (Number) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(Number value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblClusterAttMaster() {
        return (RowIterator) getAttributeInternal(TBLCLUSTERATTMASTER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblGrantAppMaster() {
        return (RowIterator) getAttributeInternal(TBLGRANTAPPMASTER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblTeamFormation() {
        return (RowIterator) getAttributeInternal(TBLTEAMFORMATION);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblTrainerAca() {
        return (RowIterator) getAttributeInternal(TBLTRAINERACA);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblTrainerPerc() {
        return (RowIterator) getAttributeInternal(TBLTRAINERPERC);
    }

    /**
     * @param trainerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number trainerId) {
        return new Key(new Object[] { trainerId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblTrainer");
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        Number loginId = null;
         try {
             loginId = new Number((String) ADFContext.getCurrent().getSessionScope().get("sessRID"));
         } catch(Exception ex) {
             ex.printStackTrace();
         }
         
         if (operation == DML_INSERT) {
             setCreatedBy(loginId);
             setUpdatedBy(loginId);
             } else if(operation == DML_UPDATE) {
             setUpdatedBy(loginId);
         }
        super.doDML(operation, e);
    }
}

