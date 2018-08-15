package cn.itcast.jk.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContractProductCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContractProductCExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andContractProductIdIsNull() {
            addCriterion("CONTRACT_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractProductIdIsNotNull() {
            addCriterion("CONTRACT_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractProductIdEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID =", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID <>", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdGreaterThan(String value) {
            addCriterion("CONTRACT_PRODUCT_ID >", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID >=", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdLessThan(String value) {
            addCriterion("CONTRACT_PRODUCT_ID <", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_PRODUCT_ID <=", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdLike(String value) {
            addCriterion("CONTRACT_PRODUCT_ID like", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotLike(String value) {
            addCriterion("CONTRACT_PRODUCT_ID not like", value, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdIn(List<String> values) {
            addCriterion("CONTRACT_PRODUCT_ID in", values, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotIn(List<String> values) {
            addCriterion("CONTRACT_PRODUCT_ID not in", values, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_PRODUCT_ID between", value1, value2, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractProductIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_PRODUCT_ID not between", value1, value2, "contractProductId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNull() {
            addCriterion("FACTORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIsNotNull() {
            addCriterion("FACTORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryIdEqualTo(String value) {
            addCriterion("FACTORY_ID =", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotEqualTo(String value) {
            addCriterion("FACTORY_ID <>", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThan(String value) {
            addCriterion("FACTORY_ID >", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID >=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThan(String value) {
            addCriterion("FACTORY_ID <", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_ID <=", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdLike(String value) {
            addCriterion("FACTORY_ID like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotLike(String value) {
            addCriterion("FACTORY_ID not like", value, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdIn(List<String> values) {
            addCriterion("FACTORY_ID in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotIn(List<String> values) {
            addCriterion("FACTORY_ID not in", values, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdBetween(String value1, String value2) {
            addCriterion("FACTORY_ID between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryIdNotBetween(String value1, String value2) {
            addCriterion("FACTORY_ID not between", value1, value2, "factoryId");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNull() {
            addCriterion("FACTORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIsNotNull() {
            addCriterion("FACTORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNameEqualTo(String value) {
            addCriterion("FACTORY_NAME =", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotEqualTo(String value) {
            addCriterion("FACTORY_NAME <>", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThan(String value) {
            addCriterion("FACTORY_NAME >", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME >=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThan(String value) {
            addCriterion("FACTORY_NAME <", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_NAME <=", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameLike(String value) {
            addCriterion("FACTORY_NAME like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotLike(String value) {
            addCriterion("FACTORY_NAME not like", value, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameIn(List<String> values) {
            addCriterion("FACTORY_NAME in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotIn(List<String> values) {
            addCriterion("FACTORY_NAME not in", values, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andFactoryNameNotBetween(String value1, String value2) {
            addCriterion("FACTORY_NAME not between", value1, value2, "factoryName");
            return (Criteria) this;
        }

        public Criteria andExportListIdIsNull() {
            addCriterion("EXPORT_LIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andExportListIdIsNotNull() {
            addCriterion("EXPORT_LIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExportListIdEqualTo(String value) {
            addCriterion("EXPORT_LIST_ID =", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdNotEqualTo(String value) {
            addCriterion("EXPORT_LIST_ID <>", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdGreaterThan(String value) {
            addCriterion("EXPORT_LIST_ID >", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXPORT_LIST_ID >=", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdLessThan(String value) {
            addCriterion("EXPORT_LIST_ID <", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdLessThanOrEqualTo(String value) {
            addCriterion("EXPORT_LIST_ID <=", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdLike(String value) {
            addCriterion("EXPORT_LIST_ID like", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdNotLike(String value) {
            addCriterion("EXPORT_LIST_ID not like", value, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdIn(List<String> values) {
            addCriterion("EXPORT_LIST_ID in", values, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdNotIn(List<String> values) {
            addCriterion("EXPORT_LIST_ID not in", values, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdBetween(String value1, String value2) {
            addCriterion("EXPORT_LIST_ID between", value1, value2, "exportListId");
            return (Criteria) this;
        }

        public Criteria andExportListIdNotBetween(String value1, String value2) {
            addCriterion("EXPORT_LIST_ID not between", value1, value2, "exportListId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNull() {
            addCriterion("INVOICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIsNotNull() {
            addCriterion("INVOICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdEqualTo(String value) {
            addCriterion("INVOICE_ID =", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotEqualTo(String value) {
            addCriterion("INVOICE_ID <>", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThan(String value) {
            addCriterion("INVOICE_ID >", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_ID >=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThan(String value) {
            addCriterion("INVOICE_ID <", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_ID <=", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdLike(String value) {
            addCriterion("INVOICE_ID like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotLike(String value) {
            addCriterion("INVOICE_ID not like", value, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdIn(List<String> values) {
            addCriterion("INVOICE_ID in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotIn(List<String> values) {
            addCriterion("INVOICE_ID not in", values, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdBetween(String value1, String value2) {
            addCriterion("INVOICE_ID between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andInvoiceIdNotBetween(String value1, String value2) {
            addCriterion("INVOICE_ID not between", value1, value2, "invoiceId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNull() {
            addCriterion("PRODUCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductNoIsNotNull() {
            addCriterion("PRODUCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductNoEqualTo(String value) {
            addCriterion("PRODUCT_NO =", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotEqualTo(String value) {
            addCriterion("PRODUCT_NO <>", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThan(String value) {
            addCriterion("PRODUCT_NO >", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO >=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThan(String value) {
            addCriterion("PRODUCT_NO <", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NO <=", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoLike(String value) {
            addCriterion("PRODUCT_NO like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotLike(String value) {
            addCriterion("PRODUCT_NO not like", value, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoIn(List<String> values) {
            addCriterion("PRODUCT_NO in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotIn(List<String> values) {
            addCriterion("PRODUCT_NO not in", values, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductNoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NO not between", value1, value2, "productNo");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNull() {
            addCriterion("PRODUCT_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andProductImageIsNotNull() {
            addCriterion("PRODUCT_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE =", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE <>", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThan(String value) {
            addCriterion("PRODUCT_IMAGE >", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE >=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThan(String value) {
            addCriterion("PRODUCT_IMAGE <", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE <=", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageLike(String value) {
            addCriterion("PRODUCT_IMAGE like", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotLike(String value) {
            addCriterion("PRODUCT_IMAGE not like", value, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageIn(List<String> values) {
            addCriterion("PRODUCT_IMAGE in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotIn(List<String> values) {
            addCriterion("PRODUCT_IMAGE not in", values, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageBetween(String value1, String value2) {
            addCriterion("PRODUCT_IMAGE between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductImageNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_IMAGE not between", value1, value2, "productImage");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("PRODUCT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("PRODUCT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("PRODUCT_DESC =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("PRODUCT_DESC <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("PRODUCT_DESC >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("PRODUCT_DESC <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("PRODUCT_DESC like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("PRODUCT_DESC not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("PRODUCT_DESC in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("PRODUCT_DESC not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andLoadingRateIsNull() {
            addCriterion("LOADING_RATE is null");
            return (Criteria) this;
        }

        public Criteria andLoadingRateIsNotNull() {
            addCriterion("LOADING_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingRateEqualTo(String value) {
            addCriterion("LOADING_RATE =", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotEqualTo(String value) {
            addCriterion("LOADING_RATE <>", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateGreaterThan(String value) {
            addCriterion("LOADING_RATE >", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateGreaterThanOrEqualTo(String value) {
            addCriterion("LOADING_RATE >=", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateLessThan(String value) {
            addCriterion("LOADING_RATE <", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateLessThanOrEqualTo(String value) {
            addCriterion("LOADING_RATE <=", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateLike(String value) {
            addCriterion("LOADING_RATE like", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotLike(String value) {
            addCriterion("LOADING_RATE not like", value, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateIn(List<String> values) {
            addCriterion("LOADING_RATE in", values, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotIn(List<String> values) {
            addCriterion("LOADING_RATE not in", values, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateBetween(String value1, String value2) {
            addCriterion("LOADING_RATE between", value1, value2, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andLoadingRateNotBetween(String value1, String value2) {
            addCriterion("LOADING_RATE not between", value1, value2, "loadingRate");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNull() {
            addCriterion("PACKING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIsNotNull() {
            addCriterion("PACKING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPackingUnitEqualTo(String value) {
            addCriterion("PACKING_UNIT =", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotEqualTo(String value) {
            addCriterion("PACKING_UNIT <>", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThan(String value) {
            addCriterion("PACKING_UNIT >", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PACKING_UNIT >=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThan(String value) {
            addCriterion("PACKING_UNIT <", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLessThanOrEqualTo(String value) {
            addCriterion("PACKING_UNIT <=", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitLike(String value) {
            addCriterion("PACKING_UNIT like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotLike(String value) {
            addCriterion("PACKING_UNIT not like", value, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitIn(List<String> values) {
            addCriterion("PACKING_UNIT in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotIn(List<String> values) {
            addCriterion("PACKING_UNIT not in", values, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitBetween(String value1, String value2) {
            addCriterion("PACKING_UNIT between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andPackingUnitNotBetween(String value1, String value2) {
            addCriterion("PACKING_UNIT not between", value1, value2, "packingUnit");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNull() {
            addCriterion("CNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCnumberIsNotNull() {
            addCriterion("CNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCnumberEqualTo(Integer value) {
            addCriterion("CNUMBER =", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotEqualTo(Integer value) {
            addCriterion("CNUMBER <>", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThan(Integer value) {
            addCriterion("CNUMBER >", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CNUMBER >=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThan(Integer value) {
            addCriterion("CNUMBER <", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberLessThanOrEqualTo(Integer value) {
            addCriterion("CNUMBER <=", value, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberIn(List<Integer> values) {
            addCriterion("CNUMBER in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotIn(List<Integer> values) {
            addCriterion("CNUMBER not in", values, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberBetween(Integer value1, Integer value2) {
            addCriterion("CNUMBER between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andCnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CNUMBER not between", value1, value2, "cnumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNull() {
            addCriterion("OUT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOutNumberIsNotNull() {
            addCriterion("OUT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOutNumberEqualTo(Integer value) {
            addCriterion("OUT_NUMBER =", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotEqualTo(Integer value) {
            addCriterion("OUT_NUMBER <>", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThan(Integer value) {
            addCriterion("OUT_NUMBER >", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("OUT_NUMBER >=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThan(Integer value) {
            addCriterion("OUT_NUMBER <", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberLessThanOrEqualTo(Integer value) {
            addCriterion("OUT_NUMBER <=", value, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberIn(List<Integer> values) {
            addCriterion("OUT_NUMBER in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotIn(List<Integer> values) {
            addCriterion("OUT_NUMBER not in", values, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberBetween(Integer value1, Integer value2) {
            addCriterion("OUT_NUMBER between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andOutNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("OUT_NUMBER not between", value1, value2, "outNumber");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNull() {
            addCriterion("FINISHED is null");
            return (Criteria) this;
        }

        public Criteria andFinishedIsNotNull() {
            addCriterion("FINISHED is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedEqualTo(Boolean value) {
            addCriterion("FINISHED =", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotEqualTo(Boolean value) {
            addCriterion("FINISHED <>", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThan(Boolean value) {
            addCriterion("FINISHED >", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("FINISHED >=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThan(Boolean value) {
            addCriterion("FINISHED <", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedLessThanOrEqualTo(Boolean value) {
            addCriterion("FINISHED <=", value, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedIn(List<Boolean> values) {
            addCriterion("FINISHED in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotIn(List<Boolean> values) {
            addCriterion("FINISHED not in", values, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedBetween(Boolean value1, Boolean value2) {
            addCriterion("FINISHED between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andFinishedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("FINISHED not between", value1, value2, "finished");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("GROSS_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("GROSS_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(BigDecimal value) {
            addCriterion("GROSS_WEIGHT >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(BigDecimal value) {
            addCriterion("GROSS_WEIGHT <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROSS_WEIGHT <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<BigDecimal> values) {
            addCriterion("GROSS_WEIGHT in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<BigDecimal> values) {
            addCriterion("GROSS_WEIGHT not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROSS_WEIGHT between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROSS_WEIGHT not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNull() {
            addCriterion("NET_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andNetWeightIsNotNull() {
            addCriterion("NET_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andNetWeightEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT =", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT <>", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThan(BigDecimal value) {
            addCriterion("NET_WEIGHT >", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT >=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThan(BigDecimal value) {
            addCriterion("NET_WEIGHT <", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NET_WEIGHT <=", value, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightIn(List<BigDecimal> values) {
            addCriterion("NET_WEIGHT in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotIn(List<BigDecimal> values) {
            addCriterion("NET_WEIGHT not in", values, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_WEIGHT between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andNetWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NET_WEIGHT not between", value1, value2, "netWeight");
            return (Criteria) this;
        }

        public Criteria andCsizeIsNull() {
            addCriterion("CSIZE is null");
            return (Criteria) this;
        }

        public Criteria andCsizeIsNotNull() {
            addCriterion("CSIZE is not null");
            return (Criteria) this;
        }

        public Criteria andCsizeEqualTo(String value) {
            addCriterion("CSIZE =", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotEqualTo(String value) {
            addCriterion("CSIZE <>", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeGreaterThan(String value) {
            addCriterion("CSIZE >", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeGreaterThanOrEqualTo(String value) {
            addCriterion("CSIZE >=", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLessThan(String value) {
            addCriterion("CSIZE <", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLessThanOrEqualTo(String value) {
            addCriterion("CSIZE <=", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeLike(String value) {
            addCriterion("CSIZE like", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotLike(String value) {
            addCriterion("CSIZE not like", value, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeIn(List<String> values) {
            addCriterion("CSIZE in", values, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotIn(List<String> values) {
            addCriterion("CSIZE not in", values, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeBetween(String value1, String value2) {
            addCriterion("CSIZE between", value1, value2, "csize");
            return (Criteria) this;
        }

        public Criteria andCsizeNotBetween(String value1, String value2) {
            addCriterion("CSIZE not between", value1, value2, "csize");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIsNull() {
            addCriterion("SIZE_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIsNotNull() {
            addCriterion("SIZE_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLengthEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH =", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH <>", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthGreaterThan(BigDecimal value) {
            addCriterion("SIZE_LENGTH >", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH >=", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthLessThan(BigDecimal value) {
            addCriterion("SIZE_LENGTH <", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_LENGTH <=", value, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthIn(List<BigDecimal> values) {
            addCriterion("SIZE_LENGTH in", values, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_LENGTH not in", values, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LENGTH between", value1, value2, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_LENGTH not between", value1, value2, "sizeLength");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIsNull() {
            addCriterion("SIZE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIsNotNull() {
            addCriterion("SIZE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andSizeWidthEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH =", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH <>", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthGreaterThan(BigDecimal value) {
            addCriterion("SIZE_WIDTH >", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH >=", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthLessThan(BigDecimal value) {
            addCriterion("SIZE_WIDTH <", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_WIDTH <=", value, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthIn(List<BigDecimal> values) {
            addCriterion("SIZE_WIDTH in", values, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_WIDTH not in", values, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_WIDTH between", value1, value2, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_WIDTH not between", value1, value2, "sizeWidth");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIsNull() {
            addCriterion("SIZE_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIsNotNull() {
            addCriterion("SIZE_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andSizeHeightEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT =", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT <>", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightGreaterThan(BigDecimal value) {
            addCriterion("SIZE_HEIGHT >", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT >=", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightLessThan(BigDecimal value) {
            addCriterion("SIZE_HEIGHT <", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIZE_HEIGHT <=", value, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightIn(List<BigDecimal> values) {
            addCriterion("SIZE_HEIGHT in", values, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotIn(List<BigDecimal> values) {
            addCriterion("SIZE_HEIGHT not in", values, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_HEIGHT between", value1, value2, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andSizeHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIZE_HEIGHT not between", value1, value2, "sizeHeight");
            return (Criteria) this;
        }

        public Criteria andProductRequestIsNull() {
            addCriterion("PRODUCT_REQUEST is null");
            return (Criteria) this;
        }

        public Criteria andProductRequestIsNotNull() {
            addCriterion("PRODUCT_REQUEST is not null");
            return (Criteria) this;
        }

        public Criteria andProductRequestEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST =", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST <>", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestGreaterThan(String value) {
            addCriterion("PRODUCT_REQUEST >", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST >=", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestLessThan(String value) {
            addCriterion("PRODUCT_REQUEST <", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_REQUEST <=", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestLike(String value) {
            addCriterion("PRODUCT_REQUEST like", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotLike(String value) {
            addCriterion("PRODUCT_REQUEST not like", value, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestIn(List<String> values) {
            addCriterion("PRODUCT_REQUEST in", values, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotIn(List<String> values) {
            addCriterion("PRODUCT_REQUEST not in", values, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestBetween(String value1, String value2) {
            addCriterion("PRODUCT_REQUEST between", value1, value2, "productRequest");
            return (Criteria) this;
        }

        public Criteria andProductRequestNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_REQUEST not between", value1, value2, "productRequest");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andCunitIsNull() {
            addCriterion("CUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCunitIsNotNull() {
            addCriterion("CUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCunitEqualTo(String value) {
            addCriterion("CUNIT =", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitNotEqualTo(String value) {
            addCriterion("CUNIT <>", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitGreaterThan(String value) {
            addCriterion("CUNIT >", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitGreaterThanOrEqualTo(String value) {
            addCriterion("CUNIT >=", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitLessThan(String value) {
            addCriterion("CUNIT <", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitLessThanOrEqualTo(String value) {
            addCriterion("CUNIT <=", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitLike(String value) {
            addCriterion("CUNIT like", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitNotLike(String value) {
            addCriterion("CUNIT not like", value, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitIn(List<String> values) {
            addCriterion("CUNIT in", values, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitNotIn(List<String> values) {
            addCriterion("CUNIT not in", values, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitBetween(String value1, String value2) {
            addCriterion("CUNIT between", value1, value2, "cunit");
            return (Criteria) this;
        }

        public Criteria andCunitNotBetween(String value1, String value2) {
            addCriterion("CUNIT not between", value1, value2, "cunit");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNull() {
            addCriterion("BOX_NUM is null");
            return (Criteria) this;
        }

        public Criteria andBoxNumIsNotNull() {
            addCriterion("BOX_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andBoxNumEqualTo(Integer value) {
            addCriterion("BOX_NUM =", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotEqualTo(Integer value) {
            addCriterion("BOX_NUM <>", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThan(Integer value) {
            addCriterion("BOX_NUM >", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOX_NUM >=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThan(Integer value) {
            addCriterion("BOX_NUM <", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumLessThanOrEqualTo(Integer value) {
            addCriterion("BOX_NUM <=", value, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumIn(List<Integer> values) {
            addCriterion("BOX_NUM in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotIn(List<Integer> values) {
            addCriterion("BOX_NUM not in", values, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumBetween(Integer value1, Integer value2) {
            addCriterion("BOX_NUM between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andBoxNumNotBetween(Integer value1, Integer value2) {
            addCriterion("BOX_NUM not between", value1, value2, "boxNum");
            return (Criteria) this;
        }

        public Criteria andExPriceIsNull() {
            addCriterion("EX_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andExPriceIsNotNull() {
            addCriterion("EX_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andExPriceEqualTo(BigDecimal value) {
            addCriterion("EX_PRICE =", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotEqualTo(BigDecimal value) {
            addCriterion("EX_PRICE <>", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceGreaterThan(BigDecimal value) {
            addCriterion("EX_PRICE >", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EX_PRICE >=", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceLessThan(BigDecimal value) {
            addCriterion("EX_PRICE <", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EX_PRICE <=", value, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceIn(List<BigDecimal> values) {
            addCriterion("EX_PRICE in", values, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotIn(List<BigDecimal> values) {
            addCriterion("EX_PRICE not in", values, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EX_PRICE between", value1, value2, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EX_PRICE not between", value1, value2, "exPrice");
            return (Criteria) this;
        }

        public Criteria andExAmountIsNull() {
            addCriterion("EX_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExAmountIsNotNull() {
            addCriterion("EX_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExAmountEqualTo(BigDecimal value) {
            addCriterion("EX_AMOUNT =", value, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountNotEqualTo(BigDecimal value) {
            addCriterion("EX_AMOUNT <>", value, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountGreaterThan(BigDecimal value) {
            addCriterion("EX_AMOUNT >", value, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EX_AMOUNT >=", value, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountLessThan(BigDecimal value) {
            addCriterion("EX_AMOUNT <", value, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EX_AMOUNT <=", value, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountIn(List<BigDecimal> values) {
            addCriterion("EX_AMOUNT in", values, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountNotIn(List<BigDecimal> values) {
            addCriterion("EX_AMOUNT not in", values, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EX_AMOUNT between", value1, value2, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EX_AMOUNT not between", value1, value2, "exAmount");
            return (Criteria) this;
        }

        public Criteria andExUnitIsNull() {
            addCriterion("EX_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andExUnitIsNotNull() {
            addCriterion("EX_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andExUnitEqualTo(String value) {
            addCriterion("EX_UNIT =", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitNotEqualTo(String value) {
            addCriterion("EX_UNIT <>", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitGreaterThan(String value) {
            addCriterion("EX_UNIT >", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitGreaterThanOrEqualTo(String value) {
            addCriterion("EX_UNIT >=", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitLessThan(String value) {
            addCriterion("EX_UNIT <", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitLessThanOrEqualTo(String value) {
            addCriterion("EX_UNIT <=", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitLike(String value) {
            addCriterion("EX_UNIT like", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitNotLike(String value) {
            addCriterion("EX_UNIT not like", value, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitIn(List<String> values) {
            addCriterion("EX_UNIT in", values, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitNotIn(List<String> values) {
            addCriterion("EX_UNIT not in", values, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitBetween(String value1, String value2) {
            addCriterion("EX_UNIT between", value1, value2, "exUnit");
            return (Criteria) this;
        }

        public Criteria andExUnitNotBetween(String value1, String value2) {
            addCriterion("EX_UNIT not between", value1, value2, "exUnit");
            return (Criteria) this;
        }

        public Criteria andNoTaxIsNull() {
            addCriterion("NO_TAX is null");
            return (Criteria) this;
        }

        public Criteria andNoTaxIsNotNull() {
            addCriterion("NO_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andNoTaxEqualTo(BigDecimal value) {
            addCriterion("NO_TAX =", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxNotEqualTo(BigDecimal value) {
            addCriterion("NO_TAX <>", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxGreaterThan(BigDecimal value) {
            addCriterion("NO_TAX >", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_TAX >=", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxLessThan(BigDecimal value) {
            addCriterion("NO_TAX <", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_TAX <=", value, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxIn(List<BigDecimal> values) {
            addCriterion("NO_TAX in", values, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxNotIn(List<BigDecimal> values) {
            addCriterion("NO_TAX not in", values, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_TAX between", value1, value2, "noTax");
            return (Criteria) this;
        }

        public Criteria andNoTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_TAX not between", value1, value2, "noTax");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("TAX is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("TAX is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("TAX =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("TAX <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("TAX >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("TAX <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("TAX in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("TAX not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("COST_PRICE >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("COST_PRICE <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostTaxIsNull() {
            addCriterion("COST_TAX is null");
            return (Criteria) this;
        }

        public Criteria andCostTaxIsNotNull() {
            addCriterion("COST_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andCostTaxEqualTo(BigDecimal value) {
            addCriterion("COST_TAX =", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotEqualTo(BigDecimal value) {
            addCriterion("COST_TAX <>", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxGreaterThan(BigDecimal value) {
            addCriterion("COST_TAX >", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TAX >=", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxLessThan(BigDecimal value) {
            addCriterion("COST_TAX <", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_TAX <=", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxIn(List<BigDecimal> values) {
            addCriterion("COST_TAX in", values, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotIn(List<BigDecimal> values) {
            addCriterion("COST_TAX not in", values, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TAX between", value1, value2, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_TAX not between", value1, value2, "costTax");
            return (Criteria) this;
        }

        public Criteria andAccessoriesIsNull() {
            addCriterion("ACCESSORIES is null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesIsNotNull() {
            addCriterion("ACCESSORIES is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesEqualTo(Boolean value) {
            addCriterion("ACCESSORIES =", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotEqualTo(Boolean value) {
            addCriterion("ACCESSORIES <>", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesGreaterThan(Boolean value) {
            addCriterion("ACCESSORIES >", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ACCESSORIES >=", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesLessThan(Boolean value) {
            addCriterion("ACCESSORIES <", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesLessThanOrEqualTo(Boolean value) {
            addCriterion("ACCESSORIES <=", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesIn(List<Boolean> values) {
            addCriterion("ACCESSORIES in", values, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotIn(List<Boolean> values) {
            addCriterion("ACCESSORIES not in", values, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesBetween(Boolean value1, Boolean value2) {
            addCriterion("ACCESSORIES between", value1, value2, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ACCESSORIES not between", value1, value2, "accessories");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}