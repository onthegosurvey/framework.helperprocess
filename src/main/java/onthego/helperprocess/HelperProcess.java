/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package onthego.helperprocess;

/**
 * @author dirceu.belem
 */
public abstract class HelperProcess {

    private String parameter;
    private String returnStr;
    private Integer returnInt;
    private Float returnFloat;
    private String description;
    private String message;

    public HelperProcess() {

    }

    public abstract void verify() throws Exception;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getReturnStr() {
        return returnStr;
    }

    public void setReturnStr(String returnStr) {
        this.returnStr = returnStr;
    }

    public Integer getReturnInt() {
        return returnInt;
    }

    public void setReturnInt(Integer returnInt) {
        this.returnInt = returnInt;
    }

    public Float getReturnFloat() {
        return returnFloat;
    }

    public void setReturnFloat(Float returnFloat) {
        this.returnFloat = returnFloat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
