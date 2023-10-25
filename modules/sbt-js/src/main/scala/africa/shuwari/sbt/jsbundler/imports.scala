/** *************************************************************** Copyright © Shuwari Africa Ltd. All rights reserved.
  * * * Shuwari Africa Ltd. licenses this file to you under the terms * of the Apache License Version 2.0 (the
  * "License"); you may * not use this file except in compliance with the License. You * may obtain a copy of the
  * License at: * * https://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in
  * writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR
  * CONDITIONS OF ANY KIND, * either express or implied. See the License for the specific * language governing
  * permissions and limitations under the * License. *
  */
package africa.shuwari.sbt.jsbundler

import sbt.*

object Imports {
  val jsPrepare =
    TaskKey[File](
      "jsPrepare",
      "Compile, link, and prepare project for packaging and/or processing with external tools."
    )

  val jsFullLink =
    SettingKey[Boolean](
      "jsFullLink",
      "Defines whether \"fullLink\" or \"fastLink\" ScalaJS Linker output is used."
    )

  val js = taskKey[File](
    "Process and/or package assembled project with external tools."
  )
}
