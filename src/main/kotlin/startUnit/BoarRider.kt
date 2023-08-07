package startUnit

class BoarRider: IStartUnit {
    override fun chooseStartUnit(): IStartUnit {
        return BoarRider()
    }
}