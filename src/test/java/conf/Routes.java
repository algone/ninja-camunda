/*
 * Copyright 2016 Fendler Consulting cc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package conf;

import controllers.Application;
import ninja.Router;
import ninja.application.ApplicationRoutes;

/**
 * @author Jens Fendler
 * 
 */
public class Routes implements ApplicationRoutes {

	/**
	 * @see ninja.application.ApplicationRoutes#init(ninja.Router)
	 */
	@Override
	public void init(Router router) {
		router.GET().route("/").with(Application.class, "index");
		
		router.GET().route("/deployments").with(Application.class, "deploymentList");
		router.GET().route("/deployments/new").with(Application.class, "deploymentNew");
	}

}
