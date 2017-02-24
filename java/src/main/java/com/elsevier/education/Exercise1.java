package com.elsevier.education;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**

TODO: Make this class immutable.

*/

public final class Exercise1 {

	public final static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person(Set<String> pn, String fn, String ln) {
			
			this.firstName = fn;
			this.lastName = ln;
			
			HashSet<String> tempSet=new HashSet<String>();
			Iterator<String> it = pn.iterator();
			while(it.hasNext()) {
				tempSet.add(it.next());
			}
			this.phoneNumbers=tempSet;
			
		}

		public Set<String> getPhoneNumbers() {
			return (Set<String>) (new HashSet<String>(this.phoneNumbers)).clone();
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public String getLastName() {
			return lastName;
		}

	}
}
