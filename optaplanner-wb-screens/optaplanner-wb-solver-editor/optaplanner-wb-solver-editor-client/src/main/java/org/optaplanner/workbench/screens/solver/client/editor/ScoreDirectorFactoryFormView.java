/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.optaplanner.workbench.screens.solver.client.editor;

import com.google.gwt.user.client.ui.IsWidget;
import org.optaplanner.workbench.screens.solver.model.ScoreDefinitionTypeModel;

public interface ScoreDirectorFactoryFormView
        extends IsWidget {

    void setPresenter( ScoreDirectorFactoryForm form );

    void addScoreDefinitionType( ScoreDefinitionTypeModel type );

    void setSelectedScoreDefinitionType( ScoreDefinitionTypeModel type );

    void setScoreDrl( String fileName );

}