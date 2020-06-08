package com.rookie.subSubmit.util

import com.rookie.subSubmit.common.Constant
import org.apache.flink.table.api.scala.StreamTableEnvironment
import org.apache.flink.table.catalog.hive.HiveCatalog

/**
  * hive catalog util
  */
object CatalogUtil {

  def initCatalog(tableEnv: StreamTableEnvironment): Unit = {
    // Create a HiveCatalog // Create a HiveCatalog

    val catalog = new HiveCatalog(Constant.HIVE_CATALOG_NAME, Constant.HIVE_DEFAULT_DATABASE,
      Constant.DEFAULT_CONFIG_FILE, Constant.HIVE_VERSION)
    // Register the catalog
    tableEnv.registerCatalog(Constant.HIVE_CATALOG_NAME, catalog)
  }

}
