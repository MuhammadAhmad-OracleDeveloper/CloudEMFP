package model.EO;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Nov 30 12:19:42 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblCertRateImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CertRateId,
        CertificationId,
        CertAmount,
        CertGrant,
        Dated,
        Ast,
        CreatedDate,
        CreatedBy,
        UpdatedDate,
        UpdatedBy,
        TblCertApproval,
        TblCertification1;
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
    public static final int CERTRATEID = AttributesEnum.CertRateId.index();
    public static final int CERTIFICATIONID = AttributesEnum.CertificationId.index();
    public static final int CERTAMOUNT = AttributesEnum.CertAmount.index();
    public static final int CERTGRANT = AttributesEnum.CertGrant.index();
    public static final int DATED = AttributesEnum.Dated.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int TBLCERTAPPROVAL = AttributesEnum.TblCertApproval.index();
    public static final int TBLCERTIFICATION1 = AttributesEnum.TblCertification1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblCertRateImpl() {
    }

    /**
     * Gets the attribute value for CertRateId, using the alias name CertRateId.
     * @return the value of CertRateId
     */
    public Number getCertRateId() {
        return (Number) getAttributeInternal(CERTRATEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertRateId.
     * @param value value to set the CertRateId
     */
    public void setCertRateId(Number value) {
        setAttributeInternal(CERTRATEID, value);
    }

    /**
     * Gets the attribute value for CertificationId, using the alias name CertificationId.
     * @return the value of CertificationId
     */
    public Number getCertificationId() {
        return (Number) getAttributeInternal(CERTIFICATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertificationId.
     * @param value value to set the CertificationId
     */
    public void setCertificationId(Number value) {
        setAttributeInternal(CERTIFICATIONID, value);
    }

    /**
     * Gets the attribute value for CertAmount, using the alias name CertAmount.
     * @return the value of CertAmount
     */
    public Number getCertAmount() {
        return (Number) getAttributeInternal(CERTAMOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertAmount.
     * @param value value to set the CertAmount
     */
    public void setCertAmount(Number value) {
        setAttributeInternal(CERTAMOUNT, value);
    }

    /**
     * Gets the attribute value for CertGrant, using the alias name CertGrant.
     * @return the value of CertGrant
     */
    public Number getCertGrant() {
        return (Number) getAttributeInternal(CERTGRANT);
    }

    /**
     * Sets <code>value</code> as the attribute value for CertGrant.
     * @param value value to set the CertGrant
     */
    public void setCertGrant(Number value) {
        setAttributeInternal(CERTGRANT, value);
    }

    /**
     * Gets the attribute value for Dated, using the alias name Dated.
     * @return the value of Dated
     */
    public Timestamp getDated() {
        return (Timestamp) getAttributeInternal(DATED);
    }

    /**
     * Sets <code>value</code> as the attribute value for Dated.
     * @param value value to set the Dated
     */
    public void setDated(Timestamp value) {
        setAttributeInternal(DATED, value);
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
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
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
     * Gets the attribute value for UpdatedDate, using the alias name UpdatedDate.
     * @return the value of UpdatedDate
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) getAttributeInternal(UPDATEDDATE);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCertApproval() {
        return (RowIterator) getAttributeInternal(TBLCERTAPPROVAL);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getTblCertification1() {
        return (EntityImpl) getAttributeInternal(TBLCERTIFICATION1);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setTblCertification1(EntityImpl value) {
        setAttributeInternal(TBLCERTIFICATION1, value);
    }

    /**
     * @param certRateId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number certRateId) {
        return new Key(new Object[] { certRateId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblCertRate");
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

