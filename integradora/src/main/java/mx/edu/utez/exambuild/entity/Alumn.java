/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utez.exambuild.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author MARCOABM
 */
@Entity
@Table
public class Alumn implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column
    private String code;
    @Column
    private String grade;
    @Column
    private String group;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumnid", fetch = FetchType.LAZY)
    private List<Historyexam> historyexamList;
    @JoinColumn(name = "Users_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Users usersid;

    public Alumn() {
    }

    public Alumn(Integer id) {
        this.id = id;
    }

    public Alumn(Integer id, String code, String grade, String group) {
        this.id = id;
        this.code = code;
        this.grade = grade;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @XmlTransient
    public List<Historyexam> getHistoryexamList() {
        return historyexamList;
    }

    public void setHistoryexamList(List<Historyexam> historyexamList) {
        this.historyexamList = historyexamList;
    }

    public Users getUsersid() {
        return usersid;
    }

    public void setUsersid(Users usersid) {
        this.usersid = usersid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumn)) {
            return false;
        }
        Alumn other = (Alumn) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.utez.exambuild.entity.Alumn[ id=" + id + " ]";
    }
    
}
