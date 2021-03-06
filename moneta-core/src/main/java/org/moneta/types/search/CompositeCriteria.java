/*
 * This software is licensed under the Apache License, Version 2.0
 * (the "License") agreement; you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moneta.types.search;

import org.moneta.types.BaseType;

/**
 * Combines individual search criteria with logical oeprators.
 * @author D. Ashmore
 *
 */
public class CompositeCriteria extends BaseType implements Criteria {
	
	public static enum Operator {AND, OR};
	
	private Operator operator;
	private Criteria[] searchCriteria;
	
	public Operator getOperator() {
		return operator;
	}
	
	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public Criteria[] getSearchCriteria() {
		return searchCriteria;
	}
	
	public void setSearchCriteria(Criteria[] searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

}
