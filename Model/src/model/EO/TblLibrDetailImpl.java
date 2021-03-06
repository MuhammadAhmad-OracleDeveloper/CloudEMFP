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
// ---    Wed Jul 31 12:22:18 PKT 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TblLibrDetailImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        LibrDetailId,
        LibrMasterId,
        Name,
        Ast,
        CreatedBy,
        CreatedDate,
        UpdatedBy,
        UpdatedDate,
        TblCluster,
        TblCluster1,
        TblCluster2,
        TblCluster3,
        TblCluster4,
        TblLibrMaster,
        TblSupplier,
        TblSupplier1;
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
    public static final int LIBRDETAILID = AttributesEnum.LibrDetailId.index();
    public static final int LIBRMASTERID = AttributesEnum.LibrMasterId.index();
    public static final int NAME = AttributesEnum.Name.index();
    public static final int AST = AttributesEnum.Ast.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDDATE = AttributesEnum.UpdatedDate.index();
    public static final int TBLCLUSTER = AttributesEnum.TblCluster.index();
    public static final int TBLCLUSTER1 = AttributesEnum.TblCluster1.index();
    public static final int TBLCLUSTER2 = AttributesEnum.TblCluster2.index();
    public static final int TBLCLUSTER3 = AttributesEnum.TblCluster3.index();
    public static final int TBLCLUSTER4 = AttributesEnum.TblCluster4.index();
    public static final int TBLLIBRMASTER = AttributesEnum.TblLibrMaster.index();
    public static final int TBLSUPPLIER = AttributesEnum.TblSupplier.index();
    public static final int TBLSUPPLIER1 = AttributesEnum.TblSupplier1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public TblLibrDetailImpl() {
    }

    /**
     * Gets the attribute value for LibrDetailId, using the alias name LibrDetailId.
     * @return the value of LibrDetailId
     */
    public Number getLibrDetailId() {
        return (Number) getAttributeInternal(LIBRDETAILID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LibrDetailId.
     * @param value value to set the LibrDetailId
     */
    public void setLibrDetailId(Number value) {
        setAttributeInternal(LIBRDETAILID, value);
    }

    /**
     * Gets the attribute value for LibrMasterId, using the alias name LibrMasterId.
     * @return the value of LibrMasterId
     */
    public Number getLibrMasterId() {
        return (Number) getAttributeInternal(LIBRMASTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LibrMasterId.
     * @param value value to set the LibrMasterId
     */
    public void setLibrMasterId(Number value) {
        setAttributeInternal(LIBRMASTERID, value);
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
    public RowIterator getTblCluster() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCluster1() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER1);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCluster2() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER2);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCluster3() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER3);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblCluster4() {
        return (RowIterator) getAttributeInternal(TBLCLUSTER4);
    }

    /**
     * @return the associated entity TblLibrMasterImpl.
     */
    public TblLibrMasterImpl getTblLibrMaster() {
        return (TblLibrMasterImpl) getAttributeInternal(TBLLIBRMASTER);
    }

    /**
     * Sets <code>value</code> as the associated entity TblLibrMasterImpl.
     */
    public void setTblLibrMaster(TblLibrMasterImpl value) {
        setAttributeInternal(TBLLIBRMASTER, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblSupplier() {
        return (RowIterator) getAttributeInternal(TBLSUPPLIER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getTblSupplier1() {
        return (RowIterator) getAttributeInternal(TBLSUPPLIER1);
    }

    /**
     * @param librDetailId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number librDetailId) {
        return new Key(new Object[] { librDetailId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("model.EO.TblLibrDetail");
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

