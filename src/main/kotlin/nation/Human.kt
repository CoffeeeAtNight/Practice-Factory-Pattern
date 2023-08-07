package nation

import startUnit.IStartUnit
import startUnit.StartUnitFactory
import startUnit.StartUnitTypes

class Human: INation {
    override fun chooseStartUnit(): IStartUnit {
        return StartUnitFactory().createStartUnit(StartUnitTypes.KNIGHT)
    }
}