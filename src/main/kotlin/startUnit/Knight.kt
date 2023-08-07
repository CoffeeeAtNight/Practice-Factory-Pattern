package startUnit

class Knight: IStartUnit {
    override fun chooseStartUnit(): IStartUnit {
        return Knight()
    }
}