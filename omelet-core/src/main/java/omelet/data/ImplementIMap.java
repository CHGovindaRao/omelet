/*******************************************************************************
 *
 * 	Copyright 2014 Springer Science+Business Media Deutschland GmbH
 * 	
 * 	Licensed under the Apache License, Version 2.0 (the "License");
 * 	you may not use this file except in compliance with the License.
 * 	You may obtain a copy of the License at
 * 	
 * 	    http://www.apache.org/licenses/LICENSE-2.0
 * 	
 * 	Unless required by applicable law or agreed to in writing, software
 * 	distributed under the License is distributed on an "AS IS" BASIS,
 * 	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 	See the License for the specific language governing permissions and
 * 	limitations under the License.
 *******************************************************************************/
package omelet.data;

import java.util.List;

import omelet.data.DataProvider.mapStrategy;

/***
 * Builder data class for {@link IMappingData}
 * 
 * @author kapilA
 *
 */
public class ImplementIMap implements IMappingData {

	private String testData = null;
	private List<String> clientEnvironment = null;
	private mapStrategy runStartegy = null;

	private ImplementIMap(Builder build) {
		this.clientEnvironment = build.clientE;
		this.testData = build.testD;
		this.runStartegy = build.runStrat;
	}

	@Override
	public String getTestData() {
		return testData;
	}

	@Override
	public List<String> getClientEnvironment() {
		return clientEnvironment;
	}

	@Override
	public mapStrategy getRunStartegy() {
		return runStartegy;
	}

	public static class Builder {

		private String testD;
		private List<String> clientE;
		private mapStrategy runStrat;

		public Builder withTestData(String testData) {
			this.testD = testData;
			return this;
		}

		public Builder withClientEnvironment(List<String> clientEData) {
			this.clientE = clientEData;
			return this;
		}

		public Builder withRunStartegy(String runStrategy) {
			if ("full".equalsIgnoreCase(runStrategy)) {
				this.runStrat = mapStrategy.Full;
			} else if ("optimal".equalsIgnoreCase(runStrategy)) {
				this.runStrat = mapStrategy.Optimal;
			} else {
				this.runStrat = null;
			}
			return this;
		}

		public ImplementIMap build() {
			return new ImplementIMap(this);
		}
	}
}
