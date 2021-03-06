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
public class Exam implements Serializable {

    @Id
    @GeneratedValue
    @Column
    private Integer id;
    @Column
    private String description;
    @Column
    private int difficult;
    @JoinColumn(name = "Category_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Category categoryid;
    @JoinColumn(name = "Teacher_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Teacher teacherid;
    @JoinColumn(name = "Topic_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Topic topicid;
    @JoinColumn(name = "Type_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Type typeid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examid", fetch = FetchType.LAZY)
    private List<Question> questionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "examid", fetch = FetchType.LAZY)
    private List<Applicationexam> applicationexamList;

    public Exam() {
    }

    public Exam(Integer id) {
        this.id = id;
    }

    public Exam(Integer id, int difficult) {
        this.id = id;
        this.difficult = difficult;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDifficult() {
        return difficult;
    }

    public void setDifficult(int difficult) {
        this.difficult = difficult;
    }

    public Category getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Category categoryid) {
        this.categoryid = categoryid;
    }

    public Teacher getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Teacher teacherid) {
        this.teacherid = teacherid;
    }

    public Topic getTopicid() {
        return topicid;
    }

    public void setTopicid(Topic topicid) {
        this.topicid = topicid;
    }

    public Type getTypeid() {
        return typeid;
    }

    public void setTypeid(Type typeid) {
        this.typeid = typeid;
    }

    @XmlTransient
    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @XmlTransient
    public List<Applicationexam> getApplicationexamList() {
        return applicationexamList;
    }

    public void setApplicationexamList(List<Applicationexam> applicationexamList) {
        this.applicationexamList = applicationexamList;
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
        if (!(object instanceof Exam)) {
            return false;
        }
        Exam other = (Exam) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.edu.utez.exambuild.entity.Exam[ id=" + id + " ]";
    }
    
}
