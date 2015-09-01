/**
 * 
 */
package org.eclipsescout.contacts.shared;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;

import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.ValidationRule;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;
import org.eclipsescout.contacts.shared.services.code.GenderCodeType;
import org.eclipsescout.contacts.shared.services.lookup.CompanyLookupCall;
import org.eclipsescout.contacts.shared.ui.template.formfield.AbstractAddressBoxData;
import org.eclipsescout.contacts.shared.ui.template.formfield.AbstractEmailFieldData;
import org.eclipsescout.contacts.shared.ui.template.formfield.AbstractPhoneFieldData;
import org.eclipsescout.contacts.shared.ui.template.formfield.AbstractPictureBoxData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 * 
 * @generated
 */
@Generated(value = "org.eclipse.scout.sdk.workspace.dto.formdata.FormDataDtoUpdateOperation", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class ContactFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public ContactFormData() {
  }

  public AddressBox getAddressBox() {
    return getFieldByClass(AddressBox.class);
  }

  public Comments getComments() {
    return getFieldByClass(Comments.class);
  }

  public Company getCompany() {
    return getFieldByClass(Company.class);
  }

  /**
   * access method for property ContactId.
   */
  public String getContactId() {
    return getContactIdProperty().getValue();
  }

  /**
   * access method for property ContactId.
   */
  public void setContactId(String contactId) {
    getContactIdProperty().setValue(contactId);
  }

  public ContactIdProperty getContactIdProperty() {
    return getPropertyByClass(ContactIdProperty.class);
  }

  public DateOfBirth getDateOfBirth() {
    return getFieldByClass(DateOfBirth.class);
  }

  public Email getEmail() {
    return getFieldByClass(Email.class);
  }

  public EmailWork getEmailWork() {
    return getFieldByClass(EmailWork.class);
  }

  public FirstName getFirstName() {
    return getFieldByClass(FirstName.class);
  }

  public GenderGroup getGenderGroup() {
    return getFieldByClass(GenderGroup.class);
  }

  public LastName getLastName() {
    return getFieldByClass(LastName.class);
  }

  public Mobile getMobile() {
    return getFieldByClass(Mobile.class);
  }

  public Phone getPhone() {
    return getFieldByClass(Phone.class);
  }

  public PhoneWork getPhoneWork() {
    return getFieldByClass(PhoneWork.class);
  }

  public PictureBox getPictureBox() {
    return getFieldByClass(PictureBox.class);
  }

  public Position getPosition() {
    return getFieldByClass(Position.class);
  }

  public static class AddressBox extends AbstractAddressBoxData {

    private static final long serialVersionUID = 1L;

    public AddressBox() {
    }
  }

  public static class Comments extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Comments() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Company extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Company() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.LOOKUP_CALL, CompanyLookupCall.class);
      ruleMap.put(ValidationRule.ZERO_NULL_EQUALITY, true);
    }
  }

  public static class ContactIdProperty extends AbstractPropertyData<String> {

    private static final long serialVersionUID = 1L;

    public ContactIdProperty() {
    }
  }

  public static class DateOfBirth extends AbstractValueFieldData<Date> {

    private static final long serialVersionUID = 1L;

    public DateOfBirth() {
    }
  }

  public static class Email extends AbstractEmailFieldData {

    private static final long serialVersionUID = 1L;

    public Email() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class EmailWork extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public EmailWork() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class FirstName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public FirstName() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class GenderGroup extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public GenderGroup() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.CODE_TYPE, GenderCodeType.class);
    }
  }

  public static class LastName extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public LastName() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Mobile extends AbstractPhoneFieldData {

    private static final long serialVersionUID = 1L;

    public Mobile() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class Phone extends AbstractPhoneFieldData {

    private static final long serialVersionUID = 1L;

    public Phone() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class PhoneWork extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public PhoneWork() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }

  public static class PictureBox extends AbstractPictureBoxData {

    private static final long serialVersionUID = 1L;

    public PictureBox() {
    }
  }

  public static class Position extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Position() {
    }

    /**
     * list of derived validation rules.
     */
    @Override
    protected void initValidationRules(Map<String, Object> ruleMap) {
      super.initValidationRules(ruleMap);
      ruleMap.put(ValidationRule.MAX_LENGTH, 4000);
    }
  }
}