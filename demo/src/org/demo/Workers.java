package org.demo;

import java.awt.List;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;



@Entity@Inheritance(strategy=InheritanceType.JOINED)
public class Workers {
	
		private String name;
		@Id
		private int empno;
		
		
		
		
	


		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		

		}



